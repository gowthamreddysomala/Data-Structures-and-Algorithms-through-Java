package practice;

public class Fibbonachiseries {
public static void print(int number){
    int a = 0;
    int b = 1;
    for(int i=0;i<number;i++){
        System.out.print(a+" ");
        int temp = a+b;
        b = a;
        a = temp;
    }
}
    public static void main(String[] args){
        print(20);
    }
}
