package Arrays.easy;

public class Movezerostostart {
    public static void move(int[] arr){
        int n = arr.length-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int k =i-1;
                while(k>=0 && arr[k]!=0){
                    arr[k+1] = arr[k];
                    k--;
                }
                arr[k+1] = 0;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,2,5,3,2,0,23,5,0,3};
        InputClass.print(arr);
        move(arr);
        InputClass.print(arr);
    }
}
