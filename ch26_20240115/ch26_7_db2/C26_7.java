/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_7_db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 *
 * @author xvpow
 */
public class C26_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JDBC
        String url = "jdbc:derby://localhost:1527/db20240115";
        String user = "qwer";
        String password = "123456";
        Random ran = new Random();
        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement()){
        con.setAutoCommit(false);
        st.executeUpdate(
                "INSERT INTO student(id,name,score) "
                        + "VALUES("+ran.nextInt(50000)+",'"+
                                            ran.nextInt(50000)+"',4)");
        
         st.executeUpdate(
                "INSERT INTO student(id,name,score) "
                        + "VALUES("+ran.nextInt(50000)+",'"+
                                            ran.nextInt(50000)+"',5)");
         if(true)
            throw new SQLException("Test");
         
                  st.executeUpdate(
                "INSERT INTO student(id,name,score) "
                        + "VALUES("+ran.nextInt(50000)+",'"+
                                            ran.nextInt(50000)+"',6)");
        con.commit();
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
