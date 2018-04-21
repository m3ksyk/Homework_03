<%--
  Created by IntelliJ IDEA.
  User: m3ksyk
  Date: 19.04.18
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>View books</title>
</head>
<body>
<table>
    <c:forEach items="${books}" var="book" >
        <tr>
           Title: <c:out value="${book.title}" />
           Author: <c:out value="${book.author}" /> <br>
        </tr>
    </c:forEach>
</table>

</body>
</html>