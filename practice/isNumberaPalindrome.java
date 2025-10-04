package practice;

public class isNumberaPalindrome {
    public static boolean ispalindrome(int number){
        int reverse = 0;
        int original = number;
        while(number>0){
            int n = number % 10;
            reverse = (reverse * 10)+n;
            number  = number/10;
        }
        if(reverse==original){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int number = 202;
        System.out.println("Is Palindrome : "+ ispalindrome(number));
    }
}
