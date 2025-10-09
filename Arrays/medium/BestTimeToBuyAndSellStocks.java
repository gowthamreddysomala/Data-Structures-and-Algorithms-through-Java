package Arrays.medium;

public class BestTimeToBuyAndSellStocks {
    public static int find(int[] arr){
        int len = arr.length;
        int max = 0;
        int min = arr[0];
        for(int i=0;i<len;i++){
            int cp = arr[i] - min;
            if(cp>max){
                max = cp;
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
    int[] arr={10,8,7,6,5,4,3,2,1,1,1,1,1,15,12,18,25,30,28,26,24,22,20,18,16,14,12,10,8,6,4,2,0,69,3,1,5,10,15,20,18};
   int bru =  find(arr);
        System.out.println("Profit is "+bru);

    }
}
