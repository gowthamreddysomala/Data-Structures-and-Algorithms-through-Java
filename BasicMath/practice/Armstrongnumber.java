package BasicMath.practice;

public class Armstrongnumber {
    public static long armstrong(int number){
        if(number<0){
            return -1;
        }
        int count = 0;
        int n = number;
        while(n>0){
            count++;
            n = n/10;
        }
        long val = 0;
        while(number>0){
            int temp = number % 10;
            val = val + countpow(temp,count);
            number = number/10;
        }
        return val;
    }
    public static long countpow(int number,int count){
       long result = 1;
        for(int i=0;i<count;i++){
            result = result * number;
        }
        return result;
    }
    public static void main(String[] args){
        int number = 8208;
        System.out.println(armstrong(number));
    }
}
