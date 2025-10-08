package Arrays.medium;

public class SubArraySumEqualsK {
    public static void subarraysum(int[] arr,int sum){
        int len = arr.length;
        int counter = 0;
        int l = 0,m=0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                counter = counter + arr[j];
                if(counter==sum){
                    l = i;
                    m=j;
                    break;
                }
            }
            counter =0;
        }
        for(int i=l;i<m-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,5,6,6,7,4,2,4,2};
        subarraysum(arr,12);
    }
}
