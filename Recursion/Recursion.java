package Recursion;

public class Recursion {
    public static void sayhi(int[] count , int len){
        System.out.println(count[len]);
        if(len==count.length-1){
            return;
        }
        sayhi(count ,++len);
        System.out.println(count[len]);
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int l = 0;
        sayhi(arr,l);
    }
}
