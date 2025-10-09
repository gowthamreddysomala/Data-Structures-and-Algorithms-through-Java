package Arrays.medium;

public class PrefixSum {
    public static void prefix_sum(int[] arr){
        int len = arr.length;
        int counter = arr[0];
        for(int i=1;i<len;i++){
            arr[i] = arr[i]+counter;
            counter = arr[i];
        }
    }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        print(arr);
        prefix_sum(arr);
        print(arr);
    }
}
