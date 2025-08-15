package Hashing;

import java.util.HashMap;

public class HashMaps {
    HashMap<Integer , Integer > hash = new HashMap<>();
    // precompute the hash to prevent recompilation every time we run it
    public void Compute(int[] arr){
        for(int i=0;i<arr.length;i++){
            int k =0;
            if(hash.get(arr[i])==null){
                k = 1;
            }
            else{
            k = hash.get(arr[i]) + 1;}
            hash.put(arr[i] ,k);
        }
        System.out.println("Computed Successfully");
    }
    // get the count of elements present from the precomputed hash
    public int getthecount(int number){
        return hash.get(number);
    }

    // hash map to count the Characters in String
    HashMap<Character , Integer> charhash = new HashMap<Character,Integer>();
    // precomputation of hash
    public void charcomputer(String word){
        for(int i=0;i<word.length();i++){
            int k =0;
            if(charhash.get(word.charAt(i))==null){
                k = 1;
            }else{ k=charhash.get(word.charAt(i)) + 1; }
            charhash.put(word.charAt(i) , k);
        }
    }

    // for finding the count of characters in the String
    public int getthecountofchar(char find){
        return charhash.get(find);
    }

    public static void main(String args[]){
        HashMaps hashMaps = new HashMaps();
        InputClass inputClass = new InputClass();
        int[] arr =inputClass.getarray();
        hashMaps.Compute(arr);
        System.out.println("Count is : " + hashMaps.getthecount(32));
        String name= "gowtham";
        char finder = 'a';
        // call the method for pre computation of String to hash map
        hashMaps.charcomputer(name);
        System.out.println("The count of characters is : " + hashMaps.getthecountofchar(finder));
    }
}
