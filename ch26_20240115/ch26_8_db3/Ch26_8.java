/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_8_db3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author xvpow
 */
public class Ch26_8 {

  
    public static void main(String[] args) {
      //JDBC
        String url = "jdbc:derby://localhost:1527/db20240115";
        String user = "qwer";
        String password = "123456";
        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement()){
       ResultSet res =  st.executeQuery("SELECT * FROM student");
                while(res.next()){
                    System.out.println(res.getInt(1));
                    System.out.println(res.getString("name"));
                    System.out.println(res.getDouble(3));
                    System.out.println("=====================");
                }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
