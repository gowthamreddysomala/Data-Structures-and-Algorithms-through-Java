package Arrays.easy;

import java.util.HashMap;

public class FrequencyofAllElemnts {
    public static HashMap<Integer,Integer> calculate(int[] arr){
        int length = arr.length;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<length;i++){
            int temp = arr[i];
             if(hashmap.get(temp)==null){
                 hashmap.put(arr[i],1);
             }else{

                 hashmap.put(arr[i],(hashmap.get(arr[i]))+1);
             }
        }
        return hashmap;
    }
    public static void main(String[] args){
        int[] arr=InputClass.getinput(100);
        System.out.println(calculate(arr));
    }
}
