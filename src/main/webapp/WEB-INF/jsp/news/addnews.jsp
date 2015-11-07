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
        <script src="resource/ckeditor/ckeditor.js"></script>
        <script src="resource/js/addnews.js"></script>
        
        
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/default/easyui.css">
        <link rel="stylesheet" type="text/css" href="resource/jquery-easyui-1.4.3/themes/icon.css">	
        <script type="text/javascript" src="resource/jquery-1.11.3.min.js"></script>
        <script type="text/javascript" src="resource/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
                
    </head>
    <body>
        <form id="addFrom" method="post" action="news/add">                                    
            
            title:<input id="title" name="title" class="easyui-textbox" style="width:200px;height:24px" 
                         data-options="required:true"  /><br/>
            <input id="content" name="content" type="hidden"/>
            
            source:<input id="sourceby" name="sourceby" class="easyui-textbox" style="width:200px;height:24px"
                         data-options="required:true"/><br/>
            title picture:<input id="titlepic" name="titlepic" class="easyui-textbox" style="width:200px;height:24px"
                             data-options="required:true"/><br/>
            
            category:<select id="categoryid" name="categoryid" class="easyui-combobox" style="width:200px;height:24px"><br/>
                <option value="1">hot</option>                
            </select><br/>           
            <a href="javascript:void(0)" onclick="lookFirst()" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:24px">have a look</a>
            <a href="javascript:void(0)" onclick="addNews()" class="easyui-linkbutton" iconCls="icon-ok" style="width:100px;height:24px">submit</a>
        </form>
        
        <h1>edit news body at here!</h1>
        <div class="adjoined-bottom">
            <div class="grid-container">
                <div class="grid-width-100">
                    <div id="editor">                        
                    </div>
                </div>
            </div>
        </div>
        
        <form id="TheForm" method="post" action="news/look" target="TheWindow">
            <input type="hidden" name="info" value="" />
        <script>
        initEditor();
        </script>
    </body>
</html>
