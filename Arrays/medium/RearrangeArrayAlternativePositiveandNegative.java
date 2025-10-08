package Arrays.medium;

public class RearrangeArrayAlternativePositiveandNegative {
    public static void rearrange(int[] arr){
        int len = arr.length;
        boolean flag = true;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(flag && arr[j]>0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = false;
                    break;
                }
                if(flag==false && arr[j]<0){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                    break;
                }
            }
        }
    }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void optimized(int[] arr){

    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,-1,-2,-3,-4,-5};
        print(arr);
        rearrange(arr);
        print(arr);
    }
}
