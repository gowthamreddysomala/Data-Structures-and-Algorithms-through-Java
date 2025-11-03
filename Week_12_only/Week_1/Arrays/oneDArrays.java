package Week_12_only.Week_1.Arrays;

public class oneDArrays {
    public static void print(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void replace(int[] arr,int orignal,int replacement){
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i] == orignal){
                arr[i] = replacement;
                return;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        print(arr);
        // replacement of an element
        replace(arr,10,0);
        print(arr);
    }
}
