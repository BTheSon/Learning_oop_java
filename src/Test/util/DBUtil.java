package Test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {
    private static DBUtil instance = null;
    private Connection connection;
    private DBUtil() {

        String url = "jdbc:mysql://localhost:3306/VehicleManagement";
        String user = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection success");

        }catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static DBUtil getInstance() throws SQLException {
        if (instance == null || instance.connection.isClosed())
            instance = new DBUtil();

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }


}
