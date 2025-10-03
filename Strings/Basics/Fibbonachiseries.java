package Strings.Basics;

public class Fibbonachiseries {
    public static void fibbo(int number){
        int a = 0;
        int b = 1;
        for(int i=0;i<number;i++){
            System.out.print(a+" ");
            int count = a+b;
            b=a;
            a=count;
        }
    }
    public static void main(String[] args){
        int count = 10;
        fibbo(10);

    }
}
