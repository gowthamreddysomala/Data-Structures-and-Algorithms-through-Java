package practice;

import java.util.Random;

public class Test {
        public static void merge(int[] arr1,int len1 , int[] arr2, int len2){
            int[] temp = new int[len1+len2];
            int i=0,j=0,t=0;
            while(i<len1 && j<len2){
                if(arr1[i]<arr2[j]){
                    temp[t] = arr1[i];
                    i++;
                }else{
                    temp[t] = arr2[j];
                    j++;
                }
                t++;
            }
            while(i<len1){
                temp[t] = arr1[i];
                i++;
                t++;
            }
            while(j<len2){
                temp[t] = arr2[j];
                j++;t++;
            }
            print(temp);

        }

        public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }

    public static void main(String[] args){
        int[] arr1 = {1,4,6,0,0,0};
        int[] arr2 = {2,3,5};
        merge(arr1,3,arr2,3);
    }
}
