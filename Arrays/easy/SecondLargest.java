package Arrays.easy;

public class SecondLargest {
    // find the largest first
    public static  int largest(int arr[]){
        int max = arr[0];
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void SecondLargest(int[] arr){
        int max = arr[0];
        int length = arr.length;
        int first_high = largest(arr);
        for(int i =0;i<length;i++){
            if(arr[i]>max && arr[i] != first_high){
                max = arr[i];
            }
        }
        System.out.println("Second highest using BruteForce : "+max);
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,2,235,656,2312,433,23,43,23346,2,53};
        SecondLargest(arr);
    }
}
