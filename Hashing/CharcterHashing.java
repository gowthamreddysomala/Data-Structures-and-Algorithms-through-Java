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
     */

    public static void main(String args[]){
        CharcterHashing charcterHashing = new CharcterHashing();
        // any String is converted to Lower case for case in-sentivitity
        String name = "Gowtham Reddy";
        char chartofind = ' ';
        System.out.println("Char count in String: "+ charcterHashing.bruteforce(name ,chartofind));
    }
}
