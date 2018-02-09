<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/23
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/test/fileUpload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
