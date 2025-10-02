package BasicMath.practice;

public class isPrime {
    public static boolean isprime(int number){
        if(number<=1){
            return false;
        }
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void upton(int number){
        int counter = 0;
        for(int i=0;i<number*number;i++){
            if(i<=1){
                continue;
            }
            if(counter == number){
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
    public static void main(String[] args){
        System.out.println(" is 26 a prime : " + isprime(26));
        upton(40);
    }
}
