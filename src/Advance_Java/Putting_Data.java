package Advance_Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Putting_Data {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Spark";
        String username = "root";
        String password = "Ayush@630";
        String query = "INSERT INTO Customers (CustomerID, Name, Email, Age, City)\n" +
                "VALUES (?,?,?,?,?)";

        try{
            Connection con = DriverManager.getConnection(url , username , password);
            PreparedStatement pr = con.prepareStatement(query);
            pr.setInt(1,2);
            pr.setString(2,"Ayushi");
            pr.setString(3,"Ayushraikwarpvt007");
            pr.setInt(4, 12);
            pr.setString(5,"indore");
            pr.executeUpdate();


        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
