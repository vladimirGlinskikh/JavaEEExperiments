<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddUser</title>
    <style>
        <%@include file="/css/styles.css" %>
    </style>
</head>
<body>
<div class="form-style-2">
    <div class="form-style-2-heading">
        Please add user!
    </div>
    <form method="post" action="users">
        <label for="first-name">First name
            <input class="input-field" type="text" id="first-name" name="first-name">
        </label>
        <label for="last-name">Last name
            <input class="input-field" type="text" id="last-name" name="last-name">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>
</body>
</html>
