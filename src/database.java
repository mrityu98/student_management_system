
import javax.swing.JOptionPane;
import java.sql.*;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author B P CHAUHAN
 */
public class database {
    
    final static String  JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3366/sms";
    final static String USER = "root";
    final static String PASS = "";
    public static Connection connection()
    {
        try
        {
            Class.forName(JDBC_DRIVER);
            Connection c =  DriverManager.getConnection(DB_URL,USER,PASS);
            return c;
        }
        catch(ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null,e);
           return null;
        }
    
}}
