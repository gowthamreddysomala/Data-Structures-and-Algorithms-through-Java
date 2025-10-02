package Strings.Basics;

import java.lang.*;

public class StringManipulationandSearching {
    public static void main(String[] args){
        String y = "Gowtham Reddy";
        String x = "Somala ";

        // concat() // merge Strings to one
        String k = x+y;
        // + symbol
        System.out.println(k);
        // using concat() // both are same
        System.out.println(x.concat(y));
        // substring()
        System.out.println(x.substring(4,6));
    }
}
