package pl.coderslab;

import com.mysql.jdbc.Driver;
import org.springframework.stereotype.Component;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbUtil {
    private static String URL = "jdbc:mysql://localhost:3306/online_bets?useSSL=false";
    private static String USER = "root";
    private static String PASS = "coderslab";


    public static Connection getConnection()
    {
        try {
            DriverManager.registerDriver(new Driver() {
            });
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }

}