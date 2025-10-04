package practice;

import java.util.HashMap;

public class RemoveDuplicateCharactersFromString {
    public static String removeDuplicates(String string){
        StringBuilder stringBuilder = new StringBuilder();
        int length = string.length();
        HashMap<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<length;i++){
           if(hashmap.containsKey(string.charAt(i))){
               int temp = hashmap.get(string.charAt(i));
               hashmap.put(string.charAt(i),temp+1);
            }else{
               hashmap.put(string.charAt(i),1);
               stringBuilder.append(string.charAt(i));
           }
        }
        return new String(stringBuilder);
    }
    public static void main(String[] args){
        String s = removeDuplicates("Gowtham Reddy");
       System.out.println(s);
    }
}
