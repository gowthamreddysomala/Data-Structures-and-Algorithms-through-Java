package Arrays.easy;

public class ReversinganArray {
    public static void reverse(int[] arr){
        int half = arr.length/2;
        int len = arr.length;
        for(int i=0;i<half;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = InputClass.getinput(10);
        System.out.println("Before Reversing : " );
        InputClass.print(arr);
        reverse(arr);
        System.out.println("After Reversing : ");
        InputClass.print(arr);
    }
}
