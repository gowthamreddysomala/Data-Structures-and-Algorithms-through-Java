package Sorting;

import java.util.Random;

public class MergeSort {
    public static void mergesort(int[] arr){
        int length = arr.length;
        if(length<2){
            return;
        }
        int half = arr.length/2;
        int[] left = new int[half];
        int[] right = new int[length-half];
        for(int i=0;i<half;i++){
            left[i] = arr[i];
        }
        for(int i=half;i<length;i++){
            right[i - half] = arr[i];
        }
        mergesort(left);
        mergesort(right);
        merge(arr,left,right);
    }

    public static void merge(int[] arr,int[] leftarr , int[] rightarr){
        int left = leftarr.length;
        int right = rightarr.length;
        int l=0,r=0,m=0;
        while(l<left && r<right){
            if(leftarr[l] <= rightarr[r]){
              arr[m] = leftarr[l];
              l++;
            }else{
                arr[m] = rightarr[r];
                r++;
            }
            m++;
        }
        while(l<left){
            arr[m] = leftarr[l];
            l++;
            m++;
        }
        while(r<right){
            arr[m] = rightarr[r];
            r++;m++;
        }
    }


    public static void print(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int length = 200;
        int[] arr = new int[length];
        Random random = new Random();
        for(int i=0;i<length;i++){
            arr[i] = random.nextInt(4023);
        }
        System.out.println("Printing the array : ");
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
