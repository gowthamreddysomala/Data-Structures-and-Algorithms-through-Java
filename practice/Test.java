package practice;

import java.util.Random;

public class Test {
        public static void movezerostoend(int[] arr){
            int counter = 0;
            int n = arr.length;
            for(int i=0;i<n;i++){
                if(arr[i]==0){
                    int temp = arr[counter];
                    arr[counter] = arr[i];
                    arr[i] = temp;
                    counter++;
                }
            }
        }
        public static void dutchnationalflag(int[] arr){
            int length = arr.length;
            int i=0,j=0,k=length-1;
            while(j<k){
                if(arr[j]==0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j++;
                }
                else if(arr[j]==1){
                    j++;
                }else if(arr[j]==2){
                    int temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                    k--;
                }
            }
        }
        public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        }
        // majority element
    public static int majorityelement(int[] arr){
            int length = arr.length;
            int member = 0;
            int votes = 0;
            for(int i=0;i<length;i++){
                if(votes==0){
                    member = arr[i];
                    votes = 1;
                }else if(arr[i]==member){
                    votes++;
                }else{
                    votes--;
                }
            }
            return  member;
    }

    public static void main(String[] args){
        int[] arr1 ={3,2,4,2,5,4,4,4,4,4,6,234,643,23,4,4,4,4,4,0,0,0,0,0,0,0,0,0,0,0,0,0};
        print(arr1);
        System.out.println();
       // dutchnationalflag(arr1);
        movezerostoend(arr1);
        print(arr1);
        System.out.println();
        System.out.println("Highest occured number is = "+ majorityelement(arr1));
    }
}
