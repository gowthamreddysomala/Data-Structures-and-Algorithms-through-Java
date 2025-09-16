package Arrays.easy;

public class CheckifArrayisSorted {
        public static boolean checkifsored(int[] arr){
            int n = arr.length;
            for(int i=0;i<n-1;i++){
               if(arr[i+1]<arr[i]){
                   return false;
               }
            }
            return true;
        }
        public static boolean RecursiveApproach(int[] arr,int length,int current){
            if(current>=length-1){
                return true;
            }
            if(arr[current]>arr[current+1]){
                return false;
            }
            return RecursiveApproach(arr,length,current+1);
        }
    public static void main(String[] args){
        int[] arr = {23,43,23,5,2,3,3532,5345,54542,34,34,534,34};
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        System.out.println("Check if sorted : "+checkifsored(arr1));
        System.out.println("Recursive Approach :"+RecursiveApproach(arr,arr.length,0));
    }
}
