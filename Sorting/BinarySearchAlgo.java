package Sorting;

public class BinarySearchAlgo {
    public static int binarysearch(int[] arr,int value,int start,int end){
    if(end>=start){
        int mid = start+(end - start)/2;
        if(arr[mid]==value){
            return mid;
        }
        if(value<arr[mid]){
            return binarysearch(arr,value,start,mid-1);
        }
        return binarysearch(arr,value,mid+1,end);
    }
    return -1;
    }
    public static int usingloop(int[] arr, int value){
        int length = arr.length;
        int start = 0;
        int end = length -1;
            while(start<=end){
            int mid = start + (end - start) /2;
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid]<value){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int x = 13;
    int y = binarysearch(arr,x,0,arr.length-1);
        System.out.println(y);
        int z = usingloop(arr,x);
        System.out.println(z);
    }
}
