package qnu.database;

import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

import qnu.database.DB.DBUtil;

public class Main {
    public static void main(String[] args) {

//        String url = "jdbc:mysql://localhost:3306/OnlineStore";
//        String username = "root";
//        String password = "";
        try {
            DBUtil dbUtil = DBUtil.getInstance();

            Statement stmt = dbUtil.getConection().createStatement();
            String query = "SELECT * FROM Orders";
            ResultSet result = stmt.executeQuery(query);
            while (result.next()) {
                System.out.println(result.getDate(3).toLocalDate());

            }
            PreparedStatement stm = dbUtil.getConection().prepareStatement("INSERT INTO PRODUCTs (name, price) VALUES ( ?, ?)");
//            stm.setInt(1, 4);
//            stm.setString(1, "key");
//            stm.setFloat(2, 3000);
//            stm.executeUpdate();
//
//            result = stm.executeQuery("Select *  from PRODUCTs");
//            while (result.next()) {
//                System.out.println(result.getInt(1));
//                System.out.println(result.getString(2));
//                System.out.println(result.getFloat(3));
//                System.out.println("======");
//            }

            stmt.executeUpdate("delete from products where name = \"key\" ");

            stm.close();
            stmt.close();
            dbUtil.getConection().close();
        } catch (SQLException e) {
            System.out.println("\nError:");
            System.out.println(e.getLocalizedMessage());
        }
    }
}

