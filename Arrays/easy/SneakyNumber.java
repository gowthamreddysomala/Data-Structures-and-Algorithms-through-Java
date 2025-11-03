package Arrays.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class SneakyNumber {
    public static int[] sneaky(int[] arr){
        int len = arr.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
            int[] arr1 = new int[2];
            int counter = 0;
            for(int i=0;i<len;i++){
            if(hashMap.containsKey(arr[i])){
                arr[counter] = arr[i];
                counter++;
            }
                hashMap.put(arr[i],1);

        }
            return arr1;

    }
    public static void main(String[] args){
        int[] arr = {0,1,1,0};
        System.out.println();
    }
}
