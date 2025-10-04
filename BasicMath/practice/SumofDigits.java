package BasicMath.practice;

public class SumofDigits {
    public static int sum(int number){
        int sum = 0;
        while(number>0){
            int temp = number % 10;
            sum = sum + temp;
            number = number/10;
        }
        return  sum;
    }
    public static void main(String[] args){
        int num = 423;
        System.out.println("Sum is " + sum(num));
    }
}
