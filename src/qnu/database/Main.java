package qnu.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

import qnu.database.DB.DBUtil;

public class Main {
    public static void main(String[] args) {

    }
}

/*

//        String url = "jdbc:mysql://localhost:3306/OnlineStore";
//        String username = "root";
//        String password = "";
        try {
            DBUtil dbUtil = DBUtil.getInstance();

            Statement stmt = dbUtil.getConection().createStatement();
            String query = "SELECT * FROM Orders";
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.print(result.getInt(0));
                System.out.println();
            }
//
//            Statement statement = dbUtil.getConection().createStatement();
//            String query = "SELECT * FROM PERSONS";
//            ResultSet resultSet = statement.executeQuery(query);
//
//            while (resultSet.next()) {
//                System.out.print(resultSet.getString("id")+ "|");
//                System.out.print(resultSet.getString("lname")+ "|");
//                System.out.println(resultSet.getString("fname")+ "|");
//            }
            dbUtil.getConection().close();
        } catch (SQLException e) {
            System.out.println("\nError:");
            System.out.println(e.getLocalizedMessage());
        }
 */