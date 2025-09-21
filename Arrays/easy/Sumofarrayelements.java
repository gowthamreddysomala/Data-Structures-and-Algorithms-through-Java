package Arrays.easy;

import java.sql.SQLOutput;

public class Sumofarrayelements {
    public static int sumofarr(int[] arr){
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        int count = sumofarr(InputClass.getinput(10));
        System.out.println("Sum is " + count);
    }
}
