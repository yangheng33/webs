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
        <script src="js/sample.js"></script>
        <link rel="stylesheet" href="css/samples.css">
        <link rel="stylesheet" href="toolbarconfigurator/lib/codemirror/neo.css">
    </head>
    <body>
        <h1>Hello World!</h1>
        <div class="adjoined-bottom">
            <div class="grid-container">
                <div class="grid-width-100">
                    <div id="editor">
                        <h1>Hello world!</h1>
                        <p>I'm an instance of <a href="http://ckeditor.com">CKEditor</a>.</p>
                    </div>
                </div>
            </div>
        </div>
        <script>
        initSample();
        </script>
    </body>
</html>
