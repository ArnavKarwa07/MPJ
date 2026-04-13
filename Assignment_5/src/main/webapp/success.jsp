<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Registration Success</title>
    <style>
      body {
        font-family: Arial, sans-serif;
        max-width: 500px;
        margin: 40px auto;
        line-height: 1.5;
      }
      a {
        display: inline-block;
        margin-top: 12px;
      }
    </style>
  </head>
  <body>
    <h2>Employee Registered Successfully</h2>
    <p>
      Employee <strong><%= request.getAttribute("employeeName") %></strong> has
      been saved in database.
    </p>
    <a href="index.jsp">Register another employee</a>
  </body>
</html>
