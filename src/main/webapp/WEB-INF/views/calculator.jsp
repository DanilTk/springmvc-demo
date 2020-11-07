<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<form:form method="post" modelAttribute="calculatorParameters" action="calculate">
    <p>First number:</p>
    <p><form:input path="fistParam" type="number"></form:input></p>

    <p>Second number:</p>
    <p><form:input path="secondParam" type="number"></form:input></p>
    <p><form:radiobutton name="calculation" path="operation" value="multiply"/>Multiply</p>
    <p><form:radiobutton name="calculation" path="operation" value="divide"/>Delete</p>
    <p><form:radiobutton name="calculation" path="operation" value="add"/>Add</p>
    <p><form:radiobutton name="calculation" path="operation" value="subtract"/>Subtract</p>
    <br>
    <input type="submit" value="Calculate">

</form:form>
</body>
</html>
