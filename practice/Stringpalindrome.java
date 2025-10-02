package practice;

public class Stringpalindrome {
    public static boolean ispalindrome(String string){
        char[] arr = string.toCharArray();
        int len = arr.length;
        for(int i=0;i<len/2;i++){
            if(arr[i]!=arr[len-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String name = "mom";
        System.out.println("is "+name+" palindrome :"+ ispalindrome(name));
    }
}
