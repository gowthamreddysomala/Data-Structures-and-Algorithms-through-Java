package Arrays.medium;

public class SlidingWindow {
    public static int max_size(int[] arr,int size){
       int max = 0;
       int count = 0;
       for(int i=0;i<size;i++){
           count = count + arr[i];

       }
        System.out.println(count);
       max = count;
       for(int i=size;i<arr.length;i++){
          count = count - arr[i-size];
          count = count + arr[i];
           System.out.println(count);
          if(count>max){
              max = count;
          }
       }
        return max;
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int max = max_size(arr,3);
        System.out.println("Max size sum : "+ max);

    }
}
