package com.mpj.assignment5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private static final String URL = "jdbc:sqlite:employee.db";

    private static final String CREATE_TABLE_SQL =
            "CREATE TABLE IF NOT EXISTS employee ("
                    + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + "name TEXT NOT NULL,"
                + "email TEXT NOT NULL UNIQUE,"
                    + "department TEXT NOT NULL,"
                    + "salary REAL NOT NULL"
                    + ")";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new SQLException("SQLite JDBC Driver not found", e);
        }

        Connection connection = DriverManager.getConnection(URL);
        initializeDatabase(connection);
        return connection;
    }

    private static void initializeDatabase(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.execute(CREATE_TABLE_SQL);
        }
    }
}
