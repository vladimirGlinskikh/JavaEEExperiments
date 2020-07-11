<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>jsp example</title>
    <style>
        <%@include file="/css/styles.css" %>
    </style>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please Sign up!
    </div>
    <form method="post" action="signUp">
        <label for="name">User name
            <input class="input-field" type="text" id="name" name="name">
        </label>
        <label for="birthDate">Birth date
            <input class="input-field" type="text" id="birthDate" name="birthDate">
        </label>
        <label for="password">Password
            <input class="input-field" type="password" id="password" name="password">
        </label>
        <input type="submit" value="Sign up">
    </form>
</div>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Already registered users!
    </div>
    <table>
        <tr>
            <th>User name</th>
            <th>Birth date</th>
        </tr>
        <c:forEach items="${usersFromServer}" var="user">
            <tr>
                <td>${user.name}</td>
                <td>${user.birthDate}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
