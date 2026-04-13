# Assignment 5 - Employee Registration

JSP + Servlet + JDBC web application for registering employees and storing their details in a local SQLite database.

## Overview

This project presents a simple employee registration flow:

1. The user opens the JSP form.
2. The form submits employee details to a servlet.
3. The servlet stores the data in SQLite through JDBC.
4. A success page confirms that the employee was saved.

## Features

- Employee registration form built with JSP.
- Servlet-based request handling.
- JDBC-based SQLite persistence.
- Automatic table creation on first run.
- Duplicate employee emails are rejected.
- Success page after a successful insert.

## Project Structure

- `src/main/webapp/index.jsp` - employee registration form.
- `src/main/java/com/mpj/assignment5/EmployeeServlet.java` - handles form submission.
- `src/main/java/com/mpj/assignment5/DBConnection.java` - creates the SQLite connection and initializes the table.
- `src/main/webapp/success.jsp` - confirmation page.
- `employee_db.sql` - SQL script for the employee table.

## Requirements

- JDK 11 or later.
- Maven.

## Run the Assignment

Use the included Windows launcher to start the app locally:

```powershell
.\start.bat
```

If you want the raw Maven command instead, run:

```powershell
mvn jetty:run
```

Then open:

```text
http://localhost:8080/assignment5-employee-registration/
```

## How It Works

### Form

`index.jsp` collects:

- Name
- Email
- Department
- Salary

The form uses `POST` and submits to `/register`.

### Servlet

`EmployeeServlet` reads the form values, validates the salary as a number, saves the employee, and forwards the user to `success.jsp`.

### Database

`DBConnection` connects to a local SQLite file named `employee.db`.

- The table is created automatically if it does not exist.
- Data is stored in the `employee` table.
- Email addresses must be unique.

## SQL Script

The included `employee_db.sql` file contains the table definition used by the application. You can run it manually in SQLite tools if you want to create the table yourself.

## Notes

- Servlet mapping: `/register`
- Form method: `POST`
- The database file is created in the application working directory.
- The project can still be packaged as a WAR with `mvn clean package`.

## Troubleshooting

- If the app does not open, confirm Java and Maven are installed and retry `start.bat`.
- If SQLite errors appear, make sure the application has permission to create `employee.db` in the current folder.
- If the page loads but the form submit fails, check the terminal output for servlet or JDBC exceptions.
