package Arrays.easy;

public class MoveAllZerostoEnd {
    private static void movetoend(int[] arr) {
    int pointer =0;
    int n = arr.length;
    for(int i=0;i<n;i++){
        if(arr[i]!=0){
            arr[pointer] = arr[i];
            pointer++;
        }
    }
    while(pointer<arr.length){
        arr[pointer] = 0;
        pointer++;
    }
    }

    public static void main(String[] arg){
        int[] arr={0,1, 0, 0, 2,-3,43,0,32,0,34,23,3523,34};
        InputClass.print(arr);
        movetoend(arr);
        InputClass.print(arr);
    }


}
