package Week_12_only.Week_1.Arrays;

public class KadanesAlgo {
    public static int Kadane_Algo(int[] arr) {
        int length = arr.length;
        int max = arr[0];
        int current = arr[0];
        for (int i = 0; i < length; i++) {
            if (arr[i] > current + arr[i]) {
                current = arr[i];
            } else {
                current = current + arr[i];
            }

        if (current > max) {
            max = current;
        }
    }
        return max;
    }
    public static int ProductSubArray(int[] arr){
        int max = arr[0];
        int current = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>current*arr[i]){
                current = arr[i];
            }else{
                current = current*arr[i];
            }
            System.out.println("c" + current);
            System.out.println("m" + max);
            if(max<current){
                max = current;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr= {2,3,-2,4};
        // maximun product answer is 6;
        System.out.println("Output of Kadanes Algorithm is : " + Kadane_Algo(arr));
        System.out.println("Maximum Product SubArray : "+ ProductSubArray(arr));
    }
}
