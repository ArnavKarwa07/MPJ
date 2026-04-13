<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            max-width: 500px;
            margin: 40px auto;
            line-height: 1.5;
        }
        label {
            display: block;
            margin-top: 12px;
        }
        input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        button {
            margin-top: 16px;
            padding: 10px 16px;
        }
        .error {
            color: #c0392b;
            margin-bottom: 12px;
        }
    </style>
</head>
<body>
<h2>Employee Registration Form</h2>

<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<p class="error"><%= error %></p>
<% } %>

<form action="register" method="post">
    <label>Name</label>
    <input type="text" name="name" required>

    <label>Email</label>
    <input type="email" name="email" required>

    <label>Department</label>
    <input type="text" name="department" required>

    <label>Salary</label>
    <input type="number" step="0.01" name="salary" required>

    <button type="submit">Register Employee</button>
</form>
</body>
</html>
