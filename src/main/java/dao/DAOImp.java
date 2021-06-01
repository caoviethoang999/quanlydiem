package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOImp implements DAO{
    Connection connection;
    private String jdbcURL = "jdbc:mysql://localhost:3306/quanlydiem?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "huy123";
    @Override
    public Connection createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}