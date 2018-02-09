<%--
  Created by IntelliJ IDEA.
  User: 李如利
  Date: 2018/1/17
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${addressList}" var="address">
    <h3>${address.addressName}</h3>
    <h3>${address.addressId}</h3>
</c:forEach>

</body>
</html>
