<%--
  Created by IntelliJ IDEA.
  User: m3ksyk
  Date: 19.04.18
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:out value="${role}" default="guest"/>
<table>
    <c:forEach items="${productsList}" var="product" >
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
