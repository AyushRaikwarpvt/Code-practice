package Advance_Java;

import kotlin.Result;

import java.sql.*;

public class Spark {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306";
        String username = "root";
        String password = "Ayush@630";
        String query = "Select * from Student";
        try{
//            1 Driver Load  Kro
            Class.forName("com.mysql.cj.jdbc.Driver");
//             2 Connection Bna Raha h
            Connection  con = DriverManager.getConnection(url , username , password);
//              3 Create Statement
            Statement smt = con.createStatement();
//                4 exicute
            ResultSet rs = smt.executeQuery(query);
            System.out.println(" ID | Name | Age | Course");
            System.out.println("-----------------------------");
            while (rs.next()){
                System.out.println(rs.getInt("CustomerID " ) + " | " +
                        rs.getString("Name") + " | " +
                        rs.getString("Email") + " | " +
                        rs.getInt("Age") + " | " +
                        rs.getString("City") + " | " );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
