package practice;

import java.util.Random;

public class Test {

    public static void sort(int[] arr){
        int len = arr.length;
        if(len<2){
            return;
        }
        int half = len/2;
        int[] left = new int[half];
        int[] right = new int[len-half];
        for(int i=0;i<half;i++){
            left[i] = arr[i];
        }
        for(int i=half;i<len;i++){
            right[i-half] = arr[i];
        }
        sort(left);
        sort(right);
        merger(arr,left,right);
    }
    public static void merger(int[] arr,int[] left,int[] right){
        int ll = left.length;
        int rr = right.length;
        int l =0,r=0,m=0;
        while(l<ll && r<rr){
            if(left[l]<right[r]){
                arr[m] = left[l];
                l++;
                m++;
            }else{
                arr[m] = right[r];
                m++;
                r++;
            }
        }
        while(l<ll){
            arr[m] = left[l];
            m++;
            l++;
        }
        while(r<rr){
            arr[m] =right[r];
            m++;
            r++;
        }
        }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr1 ={3,2,4,2,5,4,4,4,4,4,6,234,643,23,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0};
        print(arr1);
        sort(arr1);
        print(arr1);
    }
}
