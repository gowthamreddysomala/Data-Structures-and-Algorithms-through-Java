package Arrays.easy;

import java.util.HashMap;

public class SecondLargest {
    // find the largest first
    public static int usingsorting(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[n-2];
    }
    public static int findsecond(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
       // int[] arr = {2,3,5,2,235,656,2312,433333,23,43,23346,2,53};
        //int[] arr = new int[]{-5, -10, -20, -50};
        int[]  arr = {10, 10,8};

        System.out.println("using sorting : " + usingsorting(arr));
        System.out.println("using loop with second variable  : " + findsecond(arr));

    }
}
