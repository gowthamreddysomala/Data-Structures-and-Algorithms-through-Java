package Arrays.easy;

import java.sql.SQLOutput;

public class CountPositiveandNegative {
    public static int[] p_and_n(int[] arr){
        int[] temp = {0,0};
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]>0 && arr[i]!=0){
                temp[0] = temp[0]+1;
            }
            else if(arr[i]<0 && arr[i]!=0){
                temp[1] = temp[1]+1;
            }
        }
        // 0 index for positive numbers
        // 1 index for negative numbers
        return temp;
    }
    public static void main(String[] args){
        int[] arr={0,3,2,4,-1,3,4,-3,2,-4,-5,-32,-4,3,435,234,-324,-32};
        int[] temp = p_and_n(arr);
        System.out.println("Total length : "+ arr.length);
        System.out.println("+ve : " + temp[0]);
        System.out.println("-ve : "+temp[1]);
    }
}
