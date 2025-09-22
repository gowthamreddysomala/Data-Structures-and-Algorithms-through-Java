package Arrays.easy;

public class SwapFirstandLastElements {
    public static void swap(int[] arr){
         int len = arr.length;
         int temp = arr[0];
         arr[0] = arr[len-1];
         arr[len-1] = temp;
    }
    public static void main(String[] args){
        int[] arr = InputClass.getinput(10);
        System.out.println("Before Swapping first and last : ");
        InputClass.print(arr);
        swap(arr);
        System.out.println("After Swapping first and last : ");
        InputClass.print(arr);
    }
}
