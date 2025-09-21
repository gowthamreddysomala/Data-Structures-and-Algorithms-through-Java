package Sorting;

import java.util.Random;

public class MergeSort {

public static void mergesort(int[] arr){
    int length = arr.length;
    if(length<2){
        return;
    }
    int half = length/2;
    int[] left = new int[half];
    int[] right = new int[length - half];
    for(int i=0;i<half;i++){
        left[i] = arr[i];
    }
    for(int i=half;i<length;i++){
        right[i-half] = arr[i];
    }
    mergesort(left);
    mergesort(right);
    sort(arr,left,right);
}
    public static void sort(int[] arr,int[] left,int[] right){
    int ll = left.length;
    int rr = right.length;
    int l=0,r=0,m=0;
    while(l<ll && r<rr){
        if(left[l]<right[r]){
            arr[m] = left[l];
            l++;
            m++;
        }else{
            arr[m] = right[r];
            r++;
            m++;
        }
    }
    while(l<ll){
        arr[m] = left[l];
        l++;
        m++;
    }
    while(r<rr){
        arr[m] = right[r];
        r++;
        m++;
    }
    }

    public static void print(int[] ar){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int length = 10;
        int[] arr = new int[length];
        Random random = new Random();
        int count =0;
        for(int i=length-1;i>0;i--){
            //arr[i] = random.nextInt(4023);
            arr[count] = i;
            count++;
        }
        System.out.println("Printing the array : ");
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
