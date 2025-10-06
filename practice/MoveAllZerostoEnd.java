package practice;

public class MoveAllZerostoEnd {
    public static void move(int[] arr){
        int pointer = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp = arr[pointer];
                arr[pointer] = arr[i];
                arr[i] = temp;
                pointer++;
            }
        }
    }
    public static void move(int[] arr, boolean reverse){
        int pointer = arr.length-1;
        int len = arr.length;
        for(int i=0;i<arr.length;i++){
            if(arr[len-i-1]==0){
                int temp = arr[len-i-1];
                arr[len-i-1] = arr[pointer];
                arr[pointer] = temp;
                pointer--;
            }
        }
    }
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {0,1,2,0,0,0};
       print(arr);
       //move(arr);
       move(arr,true);
       print(arr);
    }
}
