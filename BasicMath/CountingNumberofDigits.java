package BasicMath;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountingNumberofDigits {
public static int countnum(int num){
    int count =0;
    while(num!=0){
        count++;
        num = num/10;
        System.out.println(num);
    }
    return count;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter the Number to count : ");;
    int num = sc.nextInt();
    System.out.println("count is : " + countnum(num));
}
}
