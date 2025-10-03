package practice;

public class Primenumber {
    public static boolean isprime(int number){

        for(int i=2;i<number;i++){
            if(number<=1){
                return false;
            }
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printn(int number){
        int counter =0;
        for(int i=0;true;i++){
            if(i<=1){
                continue;
            }
            if(counter==number){
                break;
            }
            boolean flag = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
                counter++;
            }
        }
    }
    public  static void main(String[] args){
        int counter = 11;
        System.out.println("is Prime : " + isprime(counter));
        printn(counter);
    }
}
