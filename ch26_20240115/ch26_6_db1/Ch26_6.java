/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch26_20240115.ch26_6_db1;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch26_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JDBC
        String url = "jdbc:derby://localhost:1527/db20240115";
        String user = "qwer";
        String password = "123456";
        try(Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement()){
        st.executeUpdate(
                "INSERT INTO student(id,name,score)VALUES(100,'AA',85.3)");
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
}
