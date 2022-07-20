/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC.jdbcSQLServer.jdbcSQLServer.sampleDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Hung
 */
public class InsertData {

    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://Localhost:1433;"
                + "databaseName=sampleDB;user=sa;password=sa";
        // Declare the JDBC objects.     
        Connection conn = null;
        try {
            // Establish the connection.
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");// buoc 1
            conn = DriverManager.getConnection(connectionUrl); // buoc 2  

            String sql = "INSERT INTO Users (username, password, fullname, email)"
                    + " VALUES (?, ?, ?, ?)";

            String sqlAut = "INSERT INTO authors (name, email)" + "values ( ?, ?)";

// insert Author
            PreparedStatement statement2 = conn.prepareStatement(sqlAut);
            Scanner sc = new Scanner(System.in);
            String name;
            String email;

            name = sc.nextLine();
            email = sc.nextLine();

            statement2.setString(1, name);
            statement2.setString(2, email);
            int row = statement2.executeUpdate();
            if (row > 0) {
                System.out.println("Author inserted successfully");
            }
//  insert Users
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "henry");
            statement.setString(2, "secretpass");
            statement.setString(3, "Henry");
            statement.setString(4, "Henry@microsoft.com");
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

            statement.setString(1, "bill1");
            statement.setString(2, "secretpass 1");
            statement.setString(3, "Bill Gates 1");
            statement.setString(4, "bill.gates@microsoft.com1");
            rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
