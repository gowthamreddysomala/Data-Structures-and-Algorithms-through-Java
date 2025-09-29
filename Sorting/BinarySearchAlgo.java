package Sorting;

public class BinarySearchAlgo {
    public static int binarysearch(int[] arr,int value,int start,int end){
      if(end>=start){
          int mid = start + (end-start)/2;
          if(arr[mid]==value){
              return mid;
          }
          if(arr[mid]>value){
             return binarysearch(arr,value,start,mid-1);
          }else{
             return binarysearch(arr,value,mid+1,end);
          }
      }
      return -1;
    }
    public static void main(String[] args){
    int[] arr = {34,2,34,4,5,45,6,5673,534,6,563,5,4,52,35,3,4,2,4,523,5,432};
    int x = 432;
    int y = binarysearch(arr,x,0,arr.length-1);
        System.out.println(y);
    }
}
