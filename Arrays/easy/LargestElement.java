package Arrays.easy;

public class LargestElement {
    public static  int largest(int arr[]){
       int max = Integer.MIN_VALUE;
       int n = arr.length;
       for(int i=0;i<n;i++){
          if(arr[i]>max){
              max = arr[i];
          }
       }
       return max;
    }
    public static int findbig(int[] arr,int max,int len,int count){
    if(count >= len){
        return max;
    }
    if(arr[count]>max){
        max = arr[count];
    }
    return findbig(arr,max,len,count+1);
    }
    public static void main(String args[]){
        int[] arr = {2,3,5,2,235,656,2312,433,23,43,346,2,5388};
        System.out.println("Brute Force Approach : " + largest(arr));
        System.out.println(findbig(arr,arr[0],arr.length,0));
    }
}
