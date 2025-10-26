package Arrays.hard;

public class SlidingWindowMaximum {
    public static int[] windowmaximum(int[] arr,int window){
        int len = arr.length;
        int sum = 0;
        if(len<2){
            return arr;
        }
        int[] res = new int[len-2];
        for(int i = 0;i<len-2;i++){
            int temp = returnbig(arr[i],arr[i+1],arr[i+2]);
            res[i] = temp;
        }
        return res;

    }
    public static int returnbig(int one,int two,int three){
        if(one>two&&one>three){
            return one;
        }
        else if(one<two && three<two){
            return two;
        }else{
            return three;
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
        int arr[] = {1};
        int[] temp = windowmaximum(arr,3);
        print(temp);
    }
}
