package homework.h20241024.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionPool {
    private static String url;
    private static String user;
    private static String password;
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            ResourceBundle resourceBundle = ResourceBundle.getBundle("database");
            user = resourceBundle.getString("username");
            password = resourceBundle.getString("password");
            url = resourceBundle.getString("url");

            try {
                connection = DriverManager.getConnection(url,user,password);
            }catch (SQLException e){

            }
            return connection;

        } else {
            return connection;
        }

    }
}
