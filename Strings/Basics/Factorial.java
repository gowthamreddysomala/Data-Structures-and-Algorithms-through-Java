package Strings.Basics;

public class Factorial {
    public static int calculate(int number){
       int factorial = 1;
        for(int i=1;i<number;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static int usingrecusion(int number,int count){
        if(number==1){
            return count;
        }
        count = count*number;
        return usingrecusion(--number,count);
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println("Factorial of "+n+" : "+calculate(n) );
        System.out.println("Factorial of "+n+" : "+usingrecusion(10,1)/10 );
    }
}
