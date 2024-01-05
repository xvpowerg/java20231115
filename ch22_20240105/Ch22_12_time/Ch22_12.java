/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ch22_20240105.Ch22_12_time;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author xvpow
 */
public class Ch22_12 {
    public static void main(String[] args) {
          LocalDateTime time = LocalDateTime.now();
          System.out.println(time);
          System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
    
}
