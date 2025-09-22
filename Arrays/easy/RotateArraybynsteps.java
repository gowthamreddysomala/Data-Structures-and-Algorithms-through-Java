package Arrays.easy;

public class RotateArraybynsteps {
    public static void bruteforce(int[] arr , int steps){
        int length = arr.length;
        for(int i=0;i<steps;i++){
            int temp = arr[0];
            int k = 0;
            while(k>=0 && k<length-1) {
            arr[k] = arr[k+1];
            k++;
            }
            arr[k] = temp;
        }
    }
    public static void optimal(int[] arr,int steps) {
        int n = arr.length;
        int step = steps % n;
        System.out.println(step);
        reverse(arr,0,step-1);
        reverse(arr,step,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int start , int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = InputClass.getinput(10);
        System.out.println("Before Rotation : ");
        InputClass.print(arr);
       // bruteforce(arr,3);
        optimal(arr,13);
        System.out.println("After Rotation : ");
        InputClass.print(arr);
    }
}
