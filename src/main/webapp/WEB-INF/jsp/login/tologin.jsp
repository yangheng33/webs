<%-- 
    Document   : login
    Created on : 2015-9-27, 20:52:56
    Author     : amar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%> 
<!DOCTYPE html>
<html>    
    <head>
        <base href="<%=basePath%>"> 
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">


        <title>login</title>        
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/icon.css">	
        <script type="text/javascript" src="resource/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="resource/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
        <script>
		$(document).keypress(function (e) {
			// 回车键事件  
			if (e.which == 13) {
				submitForm();
			}
		});
		function submitForm() {
			if ($('#ff').form('validate')) {
				document.getElementById("ff").submit();
			}
		}
		function clearForm() {
			$('#ff').form('clear');
		}
        </script>       

        <style>
            body{ text-align:center} 
            #centerDivCss{margin:0 auto;} 
        </style>
    </head>
    <body  background="resource/image/1.jpg">                                    
        <div style="margin:20px 0;"></div>

	<table width="100%" height="400px">
	    <tr>
		<td align="center">
		    <div width="100%" style="border-color: #eee;border-width:1px;text-align:center"></div>
		    <div class="easyui-panel" title="Login" style="width:400px;" id="centerDivCss">
			<div style="padding:10px 60px 20px 60px">
			    <form id="ff" method="post" action="user/login">
				<table cellpadding="5">
				    <tr>
					<td>LoginName:</td>
					<td><input class="easyui-textbox" type="text" id="loginname" name="loginname" data-options="required:true"></input></td>
				    </tr>
				    <tr>
					<td>Password:</td>
					<td><input class="easyui-textbox" type="password" id="pw" name="pw" data-options="required:true"></input></td>
				    </tr>
				    <tr>
					<c:if test="${login != null }">
						<td colspan="2">check loginname or password,please.</td>
					</c:if>
				    </tr>
				</table>
			    </form>
			</div>
			<div style="text-align:center;padding:5px">
			    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
			    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
			</div>
		    </div>

		</td>
	    </tr>
	</table>
    </body>
</html>
