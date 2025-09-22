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
    public static void sort(int[] arr){
        int length = arr.length;
        if(length<2){
            return;
        }
        int half = length/2;
        int[] left = new int[half];
        int[] right = new int[length-half];
        for(int i=0;i<half;i++){
            left[i] = arr[i];
        }
        for(int i=half;i<length;i++){
            right[i-half] = arr[i];
        }
        sort(left);
        sort(right);
        int leftlen = left.length;
        int rightlen = right.length;
        int m=0,l=0,r=0;
        while(l<leftlen && r<rightlen){
            if(left[l]<right[r]){
                arr[m] = left[l];
                l++;
                m++;
            }else{
                arr[m] = right[r];
                r++;m++;
            }
        }
        while(l<leftlen){
            arr[m] = left[l];
            m++;l++;
        }
        while(r<rightlen){
            arr[m] = right[r];
            r++;m++;
        }
    }
}
