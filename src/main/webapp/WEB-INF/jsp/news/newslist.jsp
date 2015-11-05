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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/icon.css">	
        <script type="text/javascript" src="resource/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="resource/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
        <script type="text/javascript">
            function toAdd(){
                window.open("news/toadd");
            }
            
            function queryNews(){
                
            }
        </script>
    </head>
    <body>
        <div style="margin:20px 0;"></div>      
        <form method="post" action="news/list">
        <table>
            <tr>
                <td></td>
                <td>
                    <input class="easyui-textbox" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;height:32px">
                </td>
                <td></td>
                <td>
                    <input class="easyui-textbox" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;height:32px">
                </td>            
                <td></td>
                <td>
                    <input class="easyui-textbox" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;height:32px">
                </td>
                <td></td>
                <td>
                    <input class="easyui-textbox" data-options="prompt:'Enter a email address...',validType:'email'" style="width:100%;height:32px">
                </td>
                <td></td>
                <td>
                    <select class="easyui-combobox" name="state" style="width:200px;">
                        <option value="AL">Alabama</option>
                        <option value="AK">Alaska</option>
                        <option value="AZ">Arizona</option>
                        <option value="AR">Arkansas</option>
                    </select> 
                </td>
                <td>
                    <a href="javascript:void(0)" onclick="queryNews()" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:32px">Query</a>            
                    <a href="javascript:void(0)" onclick="toAdd()" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:32px">Add</a>            
                </td>
                
            </tr>
        </table>        
        </form>        
       
    </body>
</html>
