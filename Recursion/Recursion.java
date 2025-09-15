package Recursion;

public class Recursion {

    public static void sayhi(int[] arr , int start, int end  ){
    if(start>=end){
        return;
    }
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    sayhi(arr,++start,--end);
    }


    public static void printarr(int arr[] , int len){
        if(len==0){
            return;
        }
        printarr(arr,--len);
        System.out.print(arr[len]+" ");
        
    }


    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int l = arr.length-1;
       // printarr(arr,arr.length);
       // sayhi(arr,0,l);
       // System.out.println();
       printarr(arr, arr.length  );
    }
}
