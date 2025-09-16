package Arrays.easy;

import java.util.HashMap;

public class SecondLargest {
    // find the largest first
    public static  int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE ;
        int length = arr.length;
        int first_high = largest(arr);
        for(int i =0;i<length;i++){
            if(arr[i]>max && arr[i] != first_high){
                max = arr[i];
            }
        }
        System.out.println("Second highest using O(2n): "+max);
    }

    // by using sorting to find
    public static void usingsorting(int[] arr){
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
        System.out.println("using Sorting method : " + arr[n-2]);
    }

    public static void Secondlargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];

            }
        }
        System.out.println("Finding the element with single iteration : "+second);
    }

    public static void main(String[] args){
        //int[] arr = {2,3,5,2,235,656,2312,433333,23,43,23346,2,53};
        int[] arr = new int[]{-5, -10, -20, -50};
        SecondLargest(arr);
        usingsorting(arr);
        // most efficient method and min values to handel edge cases
        SecondLargest(arr);
    }
}
