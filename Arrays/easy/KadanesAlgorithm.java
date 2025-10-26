package Arrays.easy;

public class KadanesAlgorithm  {
    public static int KadanesAlgo(int[] arr){
        int current = arr[0];
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>current+arr[i]){
                current = arr[i];
            }else{
                current = current+arr[i];
            }
            if(current > max){
                max = current;
            }
        }
        return max;
    }
    public static void main(String[] args){
    int[] arr = {-1,-2,4,6,-3,-2,7,-1};
        System.out.println(KadanesAlgo(arr));
    }
}
