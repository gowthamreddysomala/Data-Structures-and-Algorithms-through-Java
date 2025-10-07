package Arrays.medium;

public class MoveNagativetotheEnd {
    public static void tostart(int[] arr){
        int len = arr.length;
        int initial = 0;
        for(int i=0;i<len;i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[initial];
                arr[initial] = temp;
                initial++;
            }
        }
    }
    public static void toend(int[] arr){
        int len = arr.length;
        int pointer = len-1;
        for(int i=0;i<len;i++){
            if(arr[len-i-1]<0){
                int temp = arr[pointer];
                arr[pointer] = arr[len-i-1];
                arr[len-i-1] = temp;
                pointer--;
            }
        }
    }
    public static void print(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr =  {15, -7, 2, 0, -100, 45, -3, 99};
        print(arr);
        tostart(arr);
        print(arr);
        toend(arr);
        print(arr);
    }
}
