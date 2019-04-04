
package top.qiaojianyong.qtree.util;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZQTree {
    
    private static int id = 0;//保证id唯一
    
    public static void main(String args[]) throws IOException {
        long time_start = System.currentTimeMillis();
        System.out.println("processing...");
        String dir = "";
        //		dir = "D:\\";
        //		dir = "C:\\_QJY\\MyDevelop\\MyJava\\ZQTree";
        
        //----------------从外部接收数据 通过命令行传参数--------------------------------------
        //---命令行传过来的参数 String args[]
        //---(注意文件夹中不能出现空格,否则你的路径名会被split(" ")切割放进数组里,所以这里要拼接一下,以防万一,)
        for (String s : args) {
            dir += s.replace("\\", "\\\\") + " ";
        }
        dir = dir.trim();
        //------------------------------------------------------
        File targetFile = new File(dir + "\\zqtree-"
                + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date(System.currentTimeMillis())) + ".html");
        
        PrintWriter print = new PrintWriter(new OutputStreamWriter(new FileOutputStream(targetFile), "utf-8"), true);
        
        print.println(Constant.BEFORE);
        print(new File(dir), print, -1);
        
        System.out.println("---finish---");
        
        long time_end = System.currentTimeMillis();
        long timeElapsed = time_end - time_start;
        
        long ms = timeElapsed % 1000;
        long s = (timeElapsed / 1000) % 60;
        long min = timeElapsed / 1000 / 60;
        
        String timeElapsedStr = "   " + min + " min " + s + " s " + ms + " ms";
        System.out.println(timeElapsedStr);
        print.println(Constant.AFTER + timeElapsedStr + Constant.END);
        print.close();
    }
    
    /**
     * {
     * "id": 1,
     * "name": "系统管理1",
     * "parentId": 0,
     * },
     *
     * @param file
     * @param print
     * @param parentID
     */
    public static void print(File file, PrintWriter print, int parentID) {
        int thisId = ++id;//当前id,也是其孩子的parentID
        
        print.println("	                {");
        
        print.println("	                    \"id\": " + thisId + ",");
        print.println("	                    \"name\": \"" + file.getName() + "\",");
        print.println("	                    \"parentId\": " + parentID + ",");
        print.println("	                    \"url\": \"" + file.getAbsolutePath().replace("\\", "/") + "\",");
        
        print.println("	                }, ");
        
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                print(f, print, thisId);
            }
        }
    }
}
