package SB.Acc;

public class Fibbo {
    public static int[] fibbo(int num){
        int a = 0;
        int b = 1;
        for(int i=0;i<num;i++){
            System.out.println(a);
            int temp = a+b;
            b = a;
            a = temp;
        }
        return null;
    }
    public static void main(String[] args){
        fibbo(10);
    }
}
