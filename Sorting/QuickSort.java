package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quicksort(int[] arr,int start,int end){
        if(start<end){
            int pi = partition(arr,start,end);
            quicksort(arr,start,pi-1);
            quicksort(arr,pi+1,end);
        }
    }
    public static int partition(int[] arr,int start,int end){
       int i = start-1;
       int mid = start+(end - start)/2;
       int pivot = arr[mid];
       for(int j=start;j<=end-1;j++){
           if(arr[j]<pivot){
               i++;
               swap(arr,i,j);
           }
       }
       swap(arr,i+1,end);
       return i+1;
    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void print(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String [] args){
        int[] arr = {10, 7, 8, 9, 1, 5};
        print(arr);
        quicksort(arr,0,arr.length-1);
        print(arr);
    }
}
