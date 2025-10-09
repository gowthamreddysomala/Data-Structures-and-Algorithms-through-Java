package Arrays.medium;

public class SuffixSum {
    public static void suffix_sum(int[] arr){
       int len = arr.length;
       int counter = arr[len-1];
       for(int i=len-2 ;i>=0;i--){
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
        suffix_sum(arr);
        print(arr);
    }
}
