package FSoft.me2.repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private final String url = "jdbc:mysql://localhost:3306/";
    private final String rewriteBatchedStatements = "?rewriteBatchedStatements=true";
    private final String userName = "root";
    private final String pass = "";
    private final String dbName = "vehiclemanager";

    private Connection connection;
    private static DBUtil instance = null;

    private DBUtil() {
        try {
//            String urlPort = "jdbc:mysql://localhost:3306/";
//            String dbName = "OnlineStore";
//            String password = "";

            connection = DriverManager.getConnection(url + dbName + rewriteBatchedStatements, userName, pass);

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
