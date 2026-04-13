# ASSIGNMENT NO: 05 - START GUIDE

## Aim

Develop a web application for Employee Registration using JSP, Servlet, and JDBC.

## Objectives

- To understand server-side scripting
- To understand the concept of Servlet and JSP
- To learn the working of Servlet and JSP
- To learn database connectivity using SQLite
- To develop a web application using Servlet, JSP, and database connectivity

## Project Included

- JSP form page: `index.jsp`
- Servlet controller: `EmployeeServlet`
- JDBC helper: `DBConnection`
- Success page: `success.jsp`
- SQLite script: `employee_db.sql`

## Prerequisites

- JDK 11+
- Maven

## Quick Start

1. Start the app:
   `start.bat`
2. Or run Maven directly:
   `mvn jetty:run`
3. Open in browser:
   `http://localhost:8080/assignment5-employee-registration/`
4. SQLite database file (`employee.db`) and table are created automatically.
5. Each employee email must be unique.

## Demo Flow

1. Open registration form.
2. Enter employee details (name, email, department, salary).
3. Submit form.
4. Data is saved in SQLite and success page is shown.

## Submission Checklist

- [ ] Source code in `Assignment_5`
- [ ] Database script (`employee_db.sql`)
- [ ] Screenshots (form page + success page + SQLite table data)
- [ ] Short explanation of JSP, Servlet, and JDBC flow
