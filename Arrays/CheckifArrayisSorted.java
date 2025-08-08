package Arrays;

import Sorting.InputClass;

import java.util.Arrays;

public class CheckifArrayisSorted {
    public static void main(String args[]){
        InputClass inputClass = new InputClass();
        Boolean issorted = null;
        int[] arr1 = inputClass.getarray();
        int[] arr = {1,2,3,3,4,22};
        // Bruteforce Approach
        // comparing the given array by sorting
        int[] temp = arr1;
        Arrays.sort(temp);
        if(temp == arr1){
           // issorted = true;
        }
        System.out.println("BruteForce Approach : "+ issorted);
        // Better Approach
        inputClass.printarr(arr);
        boolean k = false;
        for(int i=0;i<arr.length-1;i++)
        {
           if(arr[i]<=arr[i+1]){
               k = true;
           }else{
               k = false;
               break;
           }
        }
        System.out.println("Optimal Approach : "+ k);

    }
}
