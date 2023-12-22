/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch17_20231222.Ch17_1_enum1;

/**
 *
 * @author xvpow
 */
public class MediaPlayer {
    public enum Action{
        PLAY,STOP,PAUSE
    }
    
    
    public static final int PLAY = 1256;
     public static final int STOP = 6789;
     public static final int PAUSE = 991;
     
     public static void atcion(Action action){
         switch(action){
             case PLAY:
                 System.out.println("播放");
                 break;
             case STOP:
                 System.out.println("停止");
                 break;
             case  PAUSE:
               System.out.println("暫停");
               break;
           
         }
     }
    public static void action(int action){
        switch(action){
            case PLAY:
                System.out.println("Play");
            break;
            case STOP:
                  System.out.println("Stop");
             break;
            case PAUSE:
                System.out.println("Pause");
            break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
