package Arrays.medium;

import java.util.HashMap;

public class MajorityElement {
    public static int majorelement(int[] arr){
        int max = 0;
        int val = 0;
        // generating hashmap
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hashmap.get(arr[i])==null){
                hashmap.put(arr[i],1);
            }else{
                hashmap.put(arr[i],hashmap.get(arr[i])+1);
            }
        }
        //retriving the highest element
        for(int i=0;i< arr.length;i++){
            int temp = hashmap.get(arr[i]);
            if(temp>max){
                max = temp;
                val = arr[i];
            }
        }
        return val;
    }
    public static int best(int arr[]){
        int len = arr.length;
        int can = 0;
        int vote =0;
        for(int i=0;i<len;i++){
            if(vote==0){
                can = arr[i];
                vote = 1;
            }
           else if(arr[i]==can){
                vote++;
            }else{
                vote--;
            }
        }
        return can;
    }
    public static void main(String[] args){
        int[] arr = {3,2,4,2,5,4,4,4,4,4,6,234,643,23,4,4,4,4,4};
        System.out.println(best(arr));
    }
}
