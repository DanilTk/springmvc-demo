<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Create new task</title>
</head>
<body>
<form method="post">
    <p>
        Task description: <input type="text" name="description">
    </p>

    <p>
        Task category: <select name="categories">
        <c:forEach items="${categoriesList}" var="option">
            <option>
                <c:out value="${option}"></c:out>
            </option>
        </c:forEach>
    </select>
    </p>

    <p>
        Task due date: <input type="date" name="due date">
    </p>
    <input type="submit" value="Submit">
</form>
</body>
</html>
