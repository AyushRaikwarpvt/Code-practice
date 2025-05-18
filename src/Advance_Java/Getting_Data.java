package Advance_Java;

import java.sql.*;

public class Getting_Data {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Spark";
        String username = "root";
        String password = "Ayush@630";
        String query = "Select * from Customers";

        try{
//            1 Driver Load  Kro
//            Class.forName("com.mysql.cj.jdbc.Driver");
//             2 Connection Bna Raha h
            Connection  con = DriverManager.getConnection(url , username , password);
//              3 Create Statement
            Statement smt = con.createStatement();
//                4 exicute
            ResultSet rs = smt.executeQuery(query);
            System.out.println(" ID | Name | Age | Course");
            System.out.println("-----------------------------");
            while (rs.next()){
                System.out.println(rs.getInt("CustomerID" ) + " | " +
                        rs.getString("Name") + " | " +
                        rs.getString("Email") + " | " +
                        rs.getInt("Age") + " | " +
                        rs.getString("City") + " | " );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
