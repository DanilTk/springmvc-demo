<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>List of tasks</title>
</head>

<body>
<form method="post" c:object="${tasksToDelete}">
    <table>
        <tr>
            <th align="left">Id</th>
            <th align="left">Description</th>
            <th align="left">Created</th>
            <th align="left">Completed</th>
            <th align="left">Status</th>
            <th align="left">Category</th>
            <th align="left">Due date</th>
            <th align="left">Delete</th>
            <th align="left">Edit</th>
        </tr>

        <c:forEach items="${taskList}" var="task">
            <tr>
                <td align="left">${task.id} </td>
                <td align="left">${task.description}</td>
                <td align="left">${task.creationDate}</td>
                <td align="left">${task.completionDate}</td>
                <td align="left">${task.status} </td>
                <td align="left">${task.category} </td>
                <td align="left">${task.dueDate} </td>
                <td align="center"><input type="radio" name="delete_button" path="tasksToDelete" value="delete"/></td>
                <td align="center"><input type="radio" name="edit_button" value="edit"/></td>
                <td>
                </td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <input type="submit" value="Edit">
    <input type="submit" value="Delete" name="delete_${task.id}">
</form>
</body>
</html>