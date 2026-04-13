package com.mpj.assignment5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {

    private static final String DUPLICATE_EMAIL_SQL =
            "SELECT 1 FROM employee WHERE lower(email) = lower(?) LIMIT 1";
    private static final String INSERT_SQL =
            "INSERT INTO employee (name, email, department, salary) VALUES (?, ?, ?, ?)";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String department = request.getParameter("department");
        String salaryText = request.getParameter("salary");

        try {
            if (emailExists(email)) {
                request.setAttribute("error", "Email already exists. Please use a different email address.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
                return;
            }

            double salary = Double.parseDouble(salaryText);
            saveEmployee(name, email, department, salary);
            request.setAttribute("employeeName", name);
            RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
            dispatcher.forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("error", "Salary must be a valid number.");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (SQLException e) {
            request.setAttribute("error", "Database error: " + e.getMessage());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    private void saveEmployee(String name, String email, String department, double salary)
            throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT_SQL)) {

            statement.setString(1, name);
            statement.setString(2, email);
            statement.setString(3, department);
            statement.setDouble(4, salary);
            statement.executeUpdate();
        }
    }

    private boolean emailExists(String email) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(DUPLICATE_EMAIL_SQL)) {

            statement.setString(1, email);

            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        }
    }
}
