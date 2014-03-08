<%--
  Created by IntelliJ IDEA.
  User: ngandriau
  Date: 3/8/14
  Time: 4:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title></title>
</head>
<body>
<p>Hello world on the server the date is: <c:out value="${now}"/></p>

<p>or formatted: <fmt:formatDate value="${now}" pattern="HH:mma MMM d, yyyy"/></p>
</body>
</html>
