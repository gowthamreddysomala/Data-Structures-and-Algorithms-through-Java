package Arrays.easy;

public class MoveZerosToEndPreventingArrangement {
    public static void print(int[] arr){
        int l = arr.length;
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void movetoend(int[] arr){
        int len = arr.length;
        int pointer = 0;
        for(int i=0;i<len;i++){
            if(arr[i]!=0){
                swap(arr,i,pointer);
                pointer++;
            }
        }
    }
    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,0,3,0,3,2,5,0,6,0,9};
        print(arr);
        movetoend(arr);
        print(arr);
    }
}
