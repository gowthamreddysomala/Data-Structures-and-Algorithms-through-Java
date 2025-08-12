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

    public static void main(String args[]){
        CharcterHashing charcterHashing = new CharcterHashing();
        // any String is converted to Lower case for case in-sentivitity
        String name = "Sreevalli";
        char chartofind = 's';
        System.out.println("Char count in String: "+ charcterHashing.bruteforce(name ,chartofind));
    }
}
