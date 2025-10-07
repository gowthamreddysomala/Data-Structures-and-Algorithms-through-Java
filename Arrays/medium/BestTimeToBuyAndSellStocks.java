package Arrays.medium;

public class BestTimeToBuyAndSellStocks {
    public static int find(int[] arr){
        int min = arr[0];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int cp = arr[i]-min;
            if(cp>max){
                max = cp;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return  max;
    }
    public static void main(String[] args){
    int[] arr={7, 1, 5, 3, 6, 4};
   int bru =  find(arr);
        System.out.println("Profit is "+bru);
    }
}
