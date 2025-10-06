package practice;

public class RotateAnArray {
    public static void rotateleft(int[] arr){
        int len = arr.length;
        int temp = arr[0];
        for(int i=0;i<len-1;i++){
            arr[i] = arr[i+1];
        }
        arr[len-1] = temp;
    }
    public static void rotateright(int[] arr){
        int length = arr.length;
        int temp = arr[length-1];
        for(int i=1;i<length;i++){
            arr[length-i] = arr[length-i-1];
        }
        arr[0] = temp;
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rotateleftbynsteps(int[] arr,int rotate){
        int len = arr.length;
        rotate = rotate%len;
        // first swap first rotate  numbers
        swap(arr,0,rotate-1);
        swap(arr,rotate,len-1);
        swap(arr,0,len-1);
    }
    public static void swap(int[] arr,int start , int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateright(int[] arr,int steps){
        int len = arr.length;
        steps = steps%len;
        swap(arr,len-steps,len-1);
        swap(arr,0,len-steps-1);
        swap(arr,0,len-1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        rotateleft(arr);
        print(arr);
        rotateright(arr);
        print(arr);
        rotateleftbynsteps(arr,3);

        print(arr);
        rotateright(arr,3);
        print(arr);
    }
}
