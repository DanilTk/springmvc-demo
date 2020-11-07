<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Index</title>
</head>

<body>
<a href="${contextPath}/task/list" class="btn btn-primary">Show all tasks</a>
<br>
<a href="${contextPath}/task/show-task-form" class="btn btn-primary">Add new task</a>
<br>
<a href="${contextPath}/calculator/show-calculator" class="btn btn-primary">Calculator</a>
<br>
</body>
</html>
