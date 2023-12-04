/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch9_20231204.Ch9_6_exception2;
import java.io.IOException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        
        try{
            
            Test1 t1 = new Test1();
            t1.testEx1(11);
        }catch(IOException ex){
            System.out.println(ex);
        }
        try{
            Test1 t2 = new Test1();
           t2.testEx2(11);    
        }catch(RuntimeException ex){
            System.out.println(ex);
        }
        
       try{
             Test1 t3 = new Test1();
                t3.testEx3(10);
       }catch(IOException ex){
           System.out.println(ex);
       }catch(SQLException ex){
            System.out.println(ex);
       }
       
    }
    
}
