package Strings.Easy;

import java.util.*;

public class AnagramCheck {
    public static boolean check(String string1 , String string2){
        if(string1.length()!=string2.length()){
            return false;
        }
        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        // hashing
        for(int i=0;i<string1.length();i++) {
            if (hashMap1.containsKey(string1.charAt(i))) {
                int temp = hashMap1.get(string1.charAt(i)) + 1;
                hashMap1.put(string1.charAt(i), temp);
            } else {
                hashMap1.put(string1.charAt(i), 1);
            }
            if (hashMap2.containsKey(string2.charAt(i))) {
                int temp = hashMap2.get(string2.charAt(i)) + 1;
                hashMap2.put(string2.charAt(i), temp);
            } else {
                hashMap2.put(string2.charAt(i), 1);
            }
        }

        return hashMap1.equals(hashMap2);
    }
    // better way using hashing itself
    public static boolean betterway(String s1 , String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int[] arr = new int[256];
        for(int i=0;i<s1.length();i++){
            int k = s1.charAt(i);
            arr[k]++;
            int y = s2.charAt(i);
            arr[y]--;
        }
        for(int l:arr){
            if(l!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(check("listen" , "silent"));
        System.out.println(betterway("listen" , "silent"));
    }
}
