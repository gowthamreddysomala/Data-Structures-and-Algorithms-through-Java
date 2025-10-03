package Strings.Basics;

public class BinarySearch {
    public static int binarysearch(int[] arr, int number){
        int len = arr.length;
        int half = len/2;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            half = start+(end-start)/2;
            if(arr[half]==number){
                return half;
            }
            if(arr[half]<number){
               start = half+1;
            }else{
                end = half-1;
            }

        }
        return 0;
    }
    public static void main(String[] args){
    int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,33,44,55,66,656};
        System.out.println(binarysearch(arr,9));
    }
}
