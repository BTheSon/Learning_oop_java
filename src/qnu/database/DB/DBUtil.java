package qnu.database.DB;

import com.mysql.cj.exceptions.StreamingNotifiable;
import com.mysql.cj.protocol.FullReadInputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private Connection connection;
    private static DBUtil instance = null;

    private DBUtil() {
        try {
            String urlPort = "jdbc:mysql://localhost:3306/";
            String dbName = "OnlineStore";
            String userName = "root";
            String password = "";

            connection = DriverManager.getConnection(urlPort + dbName, userName, password);

            System.out.println("Connection successful!");
        }catch (SQLException e) {
            System.out.println("Connection Fail");

            System.out.println(e.getLocalizedMessage());
        }
    }


    public Connection getConection() {
        return connection;
    }

    public static DBUtil getInstance() throws SQLException {
        if (instance == null || instance.getConection().isClosed())
            instance = new DBUtil();

        return instance;
    }
}
