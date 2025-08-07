package Arrays;

import Sorting.InputClass;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String a[]){
        InputClass inputClass = new InputClass();
        int[] arr = inputClass.getarray();
        int[] test1 = arr; int test2[] =arr;
        // Bruteforce approach
        Arrays.sort(test1);
        inputClass.printarr(test1);
        System.out.println("Brute Force Approach :"+test1[test1.length-2]); // 2 nd element right !!

        // Optimal Approach
        // using two loops one for finding biggest and second for finding 2 nd largest by skipping first largest
        int temp = arr[0];
        int smallest = arr[0];
        // finding biggest
        for(int i=0;i<arr.length;i++){
            if(temp<arr[i]){
                temp = arr[i];
            }
        }
        //finding 2 nd biggest
        for(int i=0;i<arr.length;i++){
            if(smallest < arr[i] && arr[i] != temp ){
                smallest = arr[i];
            }
        }
        System.out.println("Optimal Approach :" + smallest);

        // Best Approach both in one loop
        int first = arr[0];
        int second = arr[1];

    }
}
