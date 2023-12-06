/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch10_20231206.Ch10_1_exception1;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.sql.SQLException;
/**
 *
 * @author xvpow
 */
public class Ch10_1 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        try{
            System.out.println("Start");
             t1.testEx1(18);
            System.out.println("End"); 
        }catch(SQLException | IOException ex){
            System.out.println("Excetpion ex:"+ex);
        }
        
        
           try{
            System.out.println("Start");
             t1.testEx1(18);
            System.out.println("End"); 
        }catch(SQLException ex){
            System.out.println("SQLException ex");
        }catch(IOException ex){
          System.out.println("IOException ex");   
        }
       
           try{
               t1.testEx2(60); //>30 FileNotFoundException > 10
           }catch(FileNotFoundException ex){
               System.out.println("FileNotFoundException:"+ex);
           }catch(IOException ex){
                System.out.println("IOException:"+ex);
           }
           
           //因為FileNotFoundException 是 IOException的子類所以可以只寫IOException
           //口絕:越下越父
           try{
               t1.testEx2(60); //>30 FileNotFoundException > 10
           }catch(FileNotFoundException ex){
               System.out.println("FileNotFoundException:"+ex);
           }catch(IOException  ex){
                System.out.println("IOException:"+ex);
           }
           
           
           
    }
    
}
