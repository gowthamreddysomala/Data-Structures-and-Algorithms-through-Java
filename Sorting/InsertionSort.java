package Sorting;

import java.util.Collection;
import java.util.Random;

public class InsertionSort {
    public static void main(String args[]) {
        int[] arr1 = new int[5];
        Random rand = new Random();
        for(int i=arr1.length-1;i>=0;i--){
            arr1[i] = i;
        }

        int[] arr = {2,3,5,2,235,656,2312,433333,23,43,23346,2,53};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       int n = arr.length;
        for(int i=0;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
