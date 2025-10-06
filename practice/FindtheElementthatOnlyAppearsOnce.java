package practice;

import java.util.HashMap;

public class FindtheElementthatOnlyAppearsOnce {
    public static int onlyonce(int[] arr){
        int element = 0;
        int len = arr.length;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        // generating hashmap
        for(int i=0;i<len;i++){
            if(hashmap.containsKey(arr[i])){
                int temp = hashmap.get(arr[i])+1;
                hashmap.put(arr[i],temp);
            }else{
                hashmap.put(arr[i],1);
            }
        }
        // getting the element
        for(int i=0;i<len;i++){
            if(hashmap.get(arr[i])==1){
                element = arr[i];
                break;
            }
        }
        return element;
    }
    public static int onlyOnceXOR(int[] arr) {
        int unique = 0;
        for (int num : arr) {
            unique = unique ^ num;
        }
        return unique;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,56,6,7,8,9,0,2,3,4,5,56,6,7,8,9,0};
        System.out.println(onlyonce(arr));
        System.out.println(onlyOnceXOR(arr));
    }
}
