<%--
  Created by IntelliJ IDEA.
  User: m3ksyk
  Date: 19.04.18
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach begin="${start}" end="${end}" step="1" var="i">
    ${i}
</c:forEach>
</body>
</html>
