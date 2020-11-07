<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-body">
                    Create Your Task
                    <br>
                    <br>
                    <form:form method="post" modelAttribute="task" action="/task/process-task">
                        <table>
                            <tr>
                                <td>Task Description</td>
                                <td><form:input path="name"/></td>
                            </tr>

                                <%--                            <tr>--%>
                                <%--                                <td>Completion Date</td>--%>
                                <%--                                <td><form:input path="completionDate"/></td>--%>
                                <%--                            </tr>--%>

                                <%--                            <tr>--%>
                                <%--                                <td>Status</td>--%>
                                <%--                                <select name="status">--%>
                                <%--                                    <option value="PLANNED">Planned</option>--%>
                                <%--                                    <option value="COMPLETE">Complete</option>--%>
                                <%--                                </select>--%>
                                <%--                            </tr>--%>

                                <%--                            <tr>--%>
                            <td>Category</td>
                            <td><select name="category">
                                <option value="PURCHASES">Purchases</option>
                                <option value="WORK">Work</option>
                                <option value="TRAINING">Training</option>
                            </select>
                            </td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" value="Add Task"/></td>
                            </tr>
                        </table>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
