package Strings.Easy;

public class PalindromeCheck {
    // reversing method
    public static boolean check(String string){
        int length = string.length();
        for(int i=0;i<length/2;i++){
            if(string.charAt(i)!=string.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    // using string reverse Method
    public static void reverse(String s ){
    }
    public static void main(String[] args){
        String s = "G";
        System.out.println(" Is palindrome  : "+ check(s));
    }
}
