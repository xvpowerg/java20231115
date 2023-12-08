/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch11_20231208.ch11_3_abstract3;
import ch11_20231208.ch11_3_abstract2.Employee;
/**
 *
 * @author xvpow
 */
public class Ch11_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp1 =
                new PM("Ken","A0001");
        emp1.addToDo("公司會議");
        emp1.addToDo("主管會議");
         emp1.addToDo("小組會議");
         emp1.printToDoList();
 
    }
    
}
