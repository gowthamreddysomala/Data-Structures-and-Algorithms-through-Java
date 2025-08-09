package BasicMath;

public class ArmstrongNumber {
        public static void extract(int num){
            int count =0;
            int rem = 0;
            double ans = 0;
            int an = num;
            while(an>0){
               an = an/10;
               count ++;
            }
            System.out.println("count : " +count );
            while(num>0){
                rem = num % 10;
                 ans = Math.pow(rem , count) + ans;
                num = num / 10;
            }
            System.out.println((int)ans);
        }
    static boolean armstrongNumber(int n) {
        int count =0;
        int counter = n;
        while(counter>0){
            counter = counter/10;
            count++;
        }
        int rem = 0;
        double ans  =0;
        int cnt = n;
        while(cnt > 0){
            rem = cnt % 10;
            ans = Math.pow(rem ,count) + ans;
            cnt = cnt / 10;
        }
        int ls = (int)ans;
        System.out.println(ls);
        if(ls == n){
            return true;
        }
        return false;
    }
        public static void main(String ar[]){
            System.out.println(armstrongNumber(153));
            extract(153);
        }
}
