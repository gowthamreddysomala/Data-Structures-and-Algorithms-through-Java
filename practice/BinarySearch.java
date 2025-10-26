package practice;

public class BinarySearch {
    public static int recursive(int[] arr,int start,int end,int element){
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==element){
            return mid;
        }
        if(element<arr[mid]){
            end = mid-1;
        }
        if(element>arr[mid]){
            start = mid+1;
        }
        return recursive(arr,start,end,element);
    }
    public static int find(int[] arr,int element){
        int len = arr.length;
        int start = 0;
        int end = len-1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(element==arr[mid]){
                return mid;
            }
            if(element<arr[mid]){
                end = mid-1;
            }
            else if(element>arr[mid]){
                start = mid+1;
            }
        }
        return  -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77,88,99,100};
        int find = 12;
        System.out.println(recursive(arr,0,arr.length-1,find));
        System.out.println("Element Location (index) : "+ find(arr,find));
    }
}
