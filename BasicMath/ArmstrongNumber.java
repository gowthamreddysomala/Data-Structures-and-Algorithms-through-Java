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
        public static void main(String ar[]){
            extract(153);
        }
}
