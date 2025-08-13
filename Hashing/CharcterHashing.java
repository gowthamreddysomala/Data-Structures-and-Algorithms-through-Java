package Hashing;

import java.sql.SQLOutput;

// Also called as String Hashing
public class CharcterHashing {
    // Defining the Hash array
    int[] arr = new int[150];
    boolean isfresh = false;
    // Brute force Approach
    public int bruteforce(String name , char alpha){
        int number = alpha;
        name = name.toLowerCase();
        if(isfresh == false) {
            for (int i = 0; i < name.length(); i++) {
                int k = name.charAt(i);
                arr[k] = arr[k] + 1;
            }
        }
        return arr[number];
    }
    /*
    NOTE : you can improve the space efficiency of hashed array by finding the ascii value of 'a' from table : 97
                    and before char is ' is 96
                    so for every character you subtract so it looks like this
                        :  a - '
                            :  97 - 96 = 1
                                 so if one exist thet is stored on 1 th index of array .
                                 so the array size for only small case will be from 0 - 26  .. EASY ..


               Tip : so you can store based on a th index = a - a = 0 // store a at 0 th index

               b = b -a = 1 // store b at 1 th index .. do the same for extraction.
     */

    // any ways no spaces now
    int[] hash = new int[26];
    public int charadvhashing(String name , char alpha){
        name = name.toLowerCase();
        int k = alpha - 'a';
        for(int i=0;i<name.length();i++){
            int j = name.charAt(i) - 'a';
            hash[j]  = hash[j] + 1;
        }
        return hash[k];
    }

    public static void main(String args[]){
        CharcterHashing charcterHashing = new CharcterHashing();
        // any String is converted to Lower case for case in-sentivitity
        String name = "Gowthamreddy";
        char chartofind = 'e';
        //  System.out.println("Char count in String: "+ charcterHashing.bruteforce(name ,chartofind));
        System.out.println("Char Count : "+ charcterHashing.charadvhashing(name , chartofind));
    }
}
