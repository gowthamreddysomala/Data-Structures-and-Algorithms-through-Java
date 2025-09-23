package Arrays.easy;

public class CountPairsofGivenSum {
    public static int countpairs(int[] arr,int target){
        int count =0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1 ;j<len;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] temp = InputClass.getsmallarr();
        InputClass.print(temp);
        System.out.println("Pairs : "+ countpairs(temp,-25));
    }
}
