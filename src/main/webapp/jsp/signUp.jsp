<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="signUp">
    <label for="name">User name
        <input type="text" id="name" name="name">
    </label>
    <label for="birthDate">Birth date
        <input type="text" id="birthDate" name="birthDate">
    </label>
    <label for="password">Password
        <input type="password" id="password" name="password">
    </label>
    <input type="submit" value="Sign up">
</form>
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
</body>
</html>
