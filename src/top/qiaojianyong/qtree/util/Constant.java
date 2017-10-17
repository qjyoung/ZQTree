package top.qiaojianyong.qtree.util;

public class Constant {
	public static String BEFORE="<!DOCTYPE html>\r\n" + 
			"\r\n" + 
			"<head>\r\n" + 
			"    <meta charset=\"UTF-8\" />\r\n" + 
			"    <title>zqtree</title>\r\n" + 
			"    <link href=\"C:/_tree/treelibs/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n" + 
			"    <link href=\"C:/_tree/treelibs/zTree_v3/css/metroStyle/metroStyle.css\" rel=\"stylesheet\">\r\n" + 
			"</head>\r\n" + 
			"\r\n" + 
			"<body style=\"padding:50px 100px;margin-bottom:200px\"> \r\n" + 
			"    <div class=\"panel panel-default\">\r\n" + 
			"        <div class=\"panel-heading\">ZQTree</div>\r\n" + 
			"        <div class=\"panel-body\">\r\n" + 
			"            <div class=\"form-group\">\r\n" + 
			"                <div class=\"col-sm-2 control-label\">文件列表</div>\r\n" + 
			"                <div class=\"col-sm-10\">\r\n" + 
			"                    <ul id=\"tree\" class=\"ztree\"></ul>\r\n" + 
			"                </div>\r\n" + 
			"            </div>\r\n" + 
			"        </div>\r\n" + 
			"    </div>\r\n" + 
			"    <!-- 全局js -->\r\n" + 
			"    <script src=\"C:/_tree/treelibs/jquery.min.js\"></script>\r\n" + 
			"    <!--ztree-->\r\n" + 
			"    <script src=\"C:/_tree/treelibs/zTree_v3/js/jquery.ztree.all.min.js\"></script>\r\n" + 
			"\r\n" + 
			"    <script type=\"text/javaScript\">\r\n" + 
			"            var json = {\r\n" + 
			"                \"treelist\": [\r\n";
	
	public static  String AFTER="\r\n" + 
			"                ]\r\n" + 
			"            };\r\n" + 
			"            var option={\r\n" + 
			"                data: {\r\n" + 
			"                    simpleData: {\r\n" + 
			"                        enable: true,\r\n" + 
			"                        idKey: 'id',\r\n" + 
			"                        pIdKey: 'parentId',\r\n" + 
			"                        rootPId: null\r\n" + 
			"                    },\r\n" + 
			"                    key: {\r\n" + 
			"                        url: 'nourl'\r\n" + 
			"                    }\r\n" + 
			"                }\r\n" + 
			"            };\r\n" + 
			"            //加载菜单树 展开所有节点\r\n" + 
			"            $.fn.zTree.init($('#tree'),option, json.treelist).expandAll(true);\r\n" + 
			"    </script>\r\n" +
			
			"    <div class=\"form-group\">\r\n" + 
			"        <div class=\"col-sm-2 control-label\">用时</div>\r\n" + 
			"        <div class=\"col-sm-10\">\r\n"
			;
	public static String END =
			"        </div>\r\n" + 
			"    </div>\r\n" +
			"</body>\r\n" + 
			"\r\n" + 
			"</html>";
	public static void main(String[] args) {
		System.out.println(BEFORE+AFTER);
	}
}
