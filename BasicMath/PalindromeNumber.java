package BasicMath;

import java.util.Scanner;

public class PalindromeNumber {

    public static boolean ispalindrome(int x){
        // negative number cannot be a palindrome
        if(x<0){
            return false;
        }
        long rev = 0;
        int rem = 0;
        int original = x;
        // reversing a value
        while(x>0){
            rem = x % 10;
            rev = (rev * 10) + rem;
            x = x/10;
        }
        int reversed = (int)rev;
        // checking if reversed value is same as original;
        if(original == reversed){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Check :");
        int number = sc.nextInt();
        System.out.println("is palindrome : " + ispalindrome(number));
    }

}
