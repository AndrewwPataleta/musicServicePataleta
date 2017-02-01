package com.pataleta.musicService.model;

import com.mysql.jdbc.Driver;
import java.sql.*;

public class workWithDB {
    private static final String url = "jdbc:mysql://localhost:3306/musicpataleta";
    private static final String user = "root";
    private static final String password = "1234";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;

    public static ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();

            resultSet = stmt.executeQuery(query);
        } catch (Exception e) {
                e.printStackTrace();
        }finally {
            return resultSet;
        }
    }
}
