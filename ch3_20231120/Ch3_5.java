package ch3_20231120;
import java.util.Arrays;
public class Ch3_5 { 
    public static void main(String[] args) {
        int[] array1 = {25,11,2,8,6};//預設遞增排序ASC
        Arrays.sort(array1);
        
        for (int v : array1){
            System.out.print(v+" ");
        }
        System.out.println();
        int index = Arrays.binarySearch(array1, 6);
        System.out.println(index);
        //找不到
        //比所有小 一律-1
        System.out.println(Arrays.binarySearch(array1, 1) );
        //比所有大 (長度+1) *-1
        System.out.println(Arrays.binarySearch(array1, 100) );
        //在中間 假設找的數值是n 找到比n大一點位置*-1
        System.out.println(Arrays.binarySearch(array1, 7));
    }
    
}
