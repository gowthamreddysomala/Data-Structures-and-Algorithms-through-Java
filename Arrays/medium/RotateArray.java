package Arrays.medium;

public class RotateArray {
    public static void rotate(int[] arr,int steps){
        int length = arr.length;
        steps = steps % length;
        // rotate the first step elements
        swap(arr,0,steps-1);
        // rotate the remaining array
        swap(arr,steps,length-1);
        // rotate the whole array
        swap(arr,0,length-1);
    }
    public static void swap(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7,8};
        rotate(arr,5);
        print(arr);
    }
}
