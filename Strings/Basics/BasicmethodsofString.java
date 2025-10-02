package Strings.Basics;

public class BasicmethodsofString {
    public static void main(String[] args){
        // literal , assignes object in String Pool
        String s = "Gowtham Reddy";
        // new Object creation out of String pool i.e in Heap Memory
        String k = new String("Gowtham Reddy");
        // to find String length() method
        System.out.println(k.length());
        // charAt() method
        System.out.println(s.charAt(4));
        // isEmpty()
        System.out.println(s.isEmpty());
        // equals
        System.out.println(s.equals(k));
        // equalsIgnoreCase()
        System.out.println(s.equalsIgnoreCase(k));
        // compareTo()
        System.out.println(s.compareTo(k));
    }
}
