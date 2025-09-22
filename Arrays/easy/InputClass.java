package Arrays.easy;

import java.util.Random;

public class InputClass {
    public static  int[] getinput(int length){
        int[] arr = new int[length];
        Random random = new Random();
        for(int i=0;i<length;i++){
            arr[i] = random.nextInt(5000);
        }
        return arr;
    }
    public static void print(int[] arr){
        int k = arr.length;
        for(int i=0;i<k;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
}
