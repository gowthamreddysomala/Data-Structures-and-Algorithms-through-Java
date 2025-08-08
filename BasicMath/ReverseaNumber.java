package BasicMath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseaNumber {

    public static int RevrseStr(int k) throws InterruptedException {
        String num = String.valueOf(k);
        StringBuffer stringBuffer = new StringBuffer(num);
        stringBuffer.reverse();
        num = stringBuffer.toString();
        int ls = 0;
       try{
        ls = Integer.parseInt(num);
        return ls;}
       catch(Exception e){
           System.err.println("See it throws Number format Exception for Negative Numbers");
           Thread.sleep(2000);
           System.err.println("There is a Fix though , but i dont do that if i had a better solution");
           Thread.sleep(2000);
       }
       return (int)ls;
    }

    public static int Reversenum(int k) {
        long rev = 0;
        int rem = 0;
        boolean flag = false;
        if (k < 0) {
            k = k * -1;
            flag = true;
        }
        while (k > 0) {
            rem = k % 10;
            rev = (rev * 10) + rem;
            k = k / 10;
        }
        if (flag == true) {
            rev = rev * -1;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    }

    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int k = sc.nextInt();
        System.out.println("Entered number is: "+k);
        // Multiple ways , to reverse a Number
        // using String Reversing method
        // Note this won't be a great option for -ve numbers
        System.out.println("Reversed number is Using Number:" + ReverseaNumber.Reversenum(k) );
        System.out.println("Reversed number is Using String:" + ReverseaNumber.RevrseStr(k));


    }


}
