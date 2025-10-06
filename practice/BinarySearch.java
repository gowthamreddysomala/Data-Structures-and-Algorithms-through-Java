package practice;

public class BinarySearch {
    public static int find(int[] arr,int element){
    int len = arr.length;
    int start = 0;
    int mid = len/2;
    int end = arr.length;
    while(start<=end){
        mid = start + (end - start)/2;
        if(arr[mid]==element){
            return mid;
        }
        if(arr[mid]<element){
            start = mid+1;
        }else{
            end = mid -1;
        }
    }
    return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,100};
        int find = 11;
        System.out.println("Element Location (index) : "+ find(arr,find));
    }
}
