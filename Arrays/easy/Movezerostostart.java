package Arrays.easy;

public class Movezerostostart {
    public static void move(int[] arr){
        int pointer = arr.length-1;
        int len = arr.length;
        for(int i=len-1;i>=0;i--){
            if(arr[i]!=0){
                arr[pointer] = arr[i];
                pointer--;
            }
        }
        while(pointer>=0){
            arr[pointer] = 0;
            pointer--;
        }
    }
    public static void main(String[] args){
        int[] arr={0,2,5,3,2,0,23,5,0,3};
        InputClass.print(arr);
        move(arr);
        InputClass.print(arr);
    }
}
