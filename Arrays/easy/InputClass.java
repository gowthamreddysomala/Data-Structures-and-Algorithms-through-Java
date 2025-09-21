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
}
