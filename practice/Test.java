package practice;

import java.util.Random;

public class Test {

    public static void mergesort(int[] arr, int start , int end , int[]temp){
       if(start<end){
           int mid = start + (end - start)/2;
           mergesort(arr,start,mid,temp);
           mergesort(arr,mid+1,end,temp);
           sort(arr,start,mid,end,temp);
       }
    }
    public static void sort(int[] arr,int start ,int mid ,int end , int[] temp){
        int i = start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
            while(i<mid){
                temp[k++] = arr[i++];
            }
            while(j<end){
                temp[k++] = arr[j++];
            }
            for(int m=start;m<=end;m++){
                arr[m] = temp[m];
            }
        }
    }

        public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }

    public static void main(String[] args){
        int[] arr = new int[10];
        int[] temp = new int[arr.length];
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(3000);
            temp[i] = arr[i];
        }
        print(arr);
        System.out.println();
    mergesort(arr,0,arr.length-1,temp);
    print(arr);
    }
}
