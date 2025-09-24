package Sorting;

import javax.swing.*;

public class DutchNationalFlagAlgo {
    public static void better(int[] arr){
        int len = arr.length;
        int zero=0,one=0,two=0;
        // for getting counts
        for(int i=0;i<len;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else if(arr[i]==2){
                two++;
            }
        }
        one = one+zero;
        two = two+one;
        // for arranging them
        for(int i=0;i<len;i++){
            if(i<zero){
                arr[i] = 0;
                continue;
            }
            if(i<one){
                arr[i] = 1;
                continue;
            }if(i<two){
                arr[i] = 2;
            }
        }
    }

    public static void best(int[] arr){
        int l = 0, m=0, h = arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp = arr[m];
                arr[m] = arr[l];
                arr[l] = temp;
                m++;l++;
            }
            else if(arr[m]==1){
                m++;
            }
            else{
                int temp = arr[m];
                arr[m] = arr[h];
                arr[h] = temp;
                h--;
            }
        }
    }


    public static void print(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();;
    }
    public static void main(String[] args){
        int[] arr={2,1,2,0,2,0,1,0};
        print(arr);
        //better(arr);
        best(arr);
        print(arr);

    }
}
