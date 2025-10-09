package Arrays.medium;

public class ProductOfArrayExceptSelf {
    public static int[] product(int[] arr){
        int len = arr.length;
        int[] temp = new int[len];
        for(int i = 0;i<len;i++){
            temp[i] = arr[i];
        }


        int temps = 1;
        for(int i=0;i<len;i++){
            if(arr[i]<0){
                temp[i] =0;
                continue;
            }
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                temps = temps * arr[j];
            }
            temp[i] = temps;
            temps = 1;
        }
        return temp;
    }
    public static void print(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {-1,1,0,-3,3};
        int[] temp = product(arr);
        print(temp);
    }
}
