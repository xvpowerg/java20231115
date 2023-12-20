/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch16_20231220.Ch16_1_lambda1;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.BiFunction;
/**
 *
 * @author xvpow
 */
public class Ch16_1 {

    public static void main(String[] args) {
        
        Student st1 = new Student("Ken",25);
        System.out.println(st1);
        Supplier<Student> stSupp = Student::new;
        System.out.println(stSupp.get());
        Function<String,Student> stFunc = Student::new;
          System.out.println(stFunc.apply("Vivin"));
        BiFunction<String,Integer,Student> stBiFunc = Student::new;
          System.out.println(stBiFunc.apply("Lucy",25));
    }
    
}
