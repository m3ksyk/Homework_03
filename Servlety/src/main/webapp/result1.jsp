<%--
  Created by IntelliJ IDEA.
  User: m3ksyk
  Date: 19.04.18
  Time: 15:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <c:forEach items="${bookList}" var="book" >
        <tr>
            <c:out value="${book.title}" />
            <c:out value="${book.author}" />
        </tr>
    </c:forEach>
</table>

</body>
</html>
