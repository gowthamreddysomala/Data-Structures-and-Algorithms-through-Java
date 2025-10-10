package Arrays.medium;

public class ProductOfArrayExceptSelf {
    public static int[] product(int[] arr){
        int len = arr.length;
        int temp = 1;
        for(int i=0;i<len;i++){

        }
        return arr;
    }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {-1,1,0,-3,3};
        int[] temp = product(arr);
        print(temp);
    }
}
