package Sorting;

import java.sql.SQLOutput;

public class BubbleSort {
    public static void main(String a[]) {
        InputClass inputClass = new InputClass();
        int[] arr = inputClass.getarray();
        // getting the input from InputClass
        // printing the array
        inputClass.printarr(arr);
        System.out.println("Ascending order");

        // sorting ascending order wise
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
              if(arr[j]>arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;
              }
            }
        }
        // printing the elements
        inputClass.printarr(arr);
        System.out.println("Descending Order :");
        // now descending order wise
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<=arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        inputClass.printarr(arr);

    }
}