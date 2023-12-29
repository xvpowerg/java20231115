
package ch20_20231229.Ch20_3_stream1;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Random;
public class Ch20_3 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random();
        Stream<String> st1 =
                Stream.of("A","B","C","D");
        st1.forEach(v->System.out.println(v));
        
        Stream<String> st2 = Stream.generate(()->ran.nextInt()+"");
        st2.limit(5).forEach(v->System.out.println(v));
        
        Stream<Integer>st3 = Stream.iterate(1, v->v+2);
        st3.limit(6).forEach(v->System.out.println(v));
        
        System.out.println("============================");
        IntStream iSteam1 = IntStream.of(5,3,2,1);
        iSteam1.forEach(v->System.out.println(v));
          System.out.println("============================");
        IntStream iStream2 = IntStream.range(1, 6);
        iStream2.forEach(v->System.out.println(v));
              System.out.println("============================");
        IntStream iStream3 = IntStream.rangeClosed(1, 6);
        iStream3.forEach(v->System.out.println(v));
          System.out.println("============================");
        IntStream iStresm4 = IntStream.iterate(1, v->v+3);
        iStresm4.limit(5).forEach(v->System.out.println(v));
    }
    
}
