/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch17_20231222.Ch17_2_enum2;

/**
 *
 * @author xvpow
 */
public class Ch17_2 {

   enum Animal{
       Dog,Cat,Monkey
   }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Animal.Dog);
        System.out.println(Animal.Dog.ordinal());
        System.out.println(Animal.Monkey.ordinal());
       Animal cat =  Animal.valueOf("Cat");
       System.out.println(cat);
       Animal empty =  Animal.valueOf("Bird");
    }
    
}
