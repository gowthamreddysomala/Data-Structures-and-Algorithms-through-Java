package Arrays;

import Sorting.InputClass;

import java.util.Arrays;

public class LargestElement {
    public static void main(String args[]){
        InputClass inputClass = new InputClass();
        int[] arr = inputClass.getarray();
        inputClass.printarr(arr);
        int k = arr[0];

        // brute force approach
        int[] test = arr;
        Arrays.sort(test);
        System.out.println("Brute force Approach : " + test[test.length-1]);

        // largest element from array Recursive Approach
        for(int i=0;i<arr.length;i++){
            if(k<arr[i]){
                k = arr[i];
            }
        }
        System.out.println("Optimal Result :" + k);
    }
}
