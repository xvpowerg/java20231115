/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch15_20231218.Ch15_4_InnerClass4;

/**
 *
 * @author xvpow
 */
public class Ch15_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Dog dog1 = new Dog();
      dog1.setName("Bobo");
      dog1.bark();
      //匿名內部類不可修改區域變數
      Dog dog2 = new Dog(){
        public void bark(){
              System.out.println(getName()+":喵喵~");
        }
      };
      dog2.setName("NoNo");
      dog2.bark();
      //匿名內部類
      Fly f1 = new Fly(){
          public void flying(){
              System.out.println("飛!");
          }
      };
      
      f1.flying();
    }
    
}
