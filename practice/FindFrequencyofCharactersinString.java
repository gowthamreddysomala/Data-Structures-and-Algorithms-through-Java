package practice;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyofCharactersinString {
    public static void findfrequecy(String string){
        int length = string.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        // generating the hash
        for(int i=0;i<length;i++){
            if(hashMap.containsKey(string.charAt(i))){
                hashMap.put(string.charAt(i), hashMap.get(string.charAt(i))+1);
            }else{
                hashMap.put(string.charAt(i),1);
            }
        }
        // showing the charcount
        System.out.println(hashMap);
    }
    public static void main(String[] args){
        String s = "sreevalli";
    findfrequecy(s);
    }
}
