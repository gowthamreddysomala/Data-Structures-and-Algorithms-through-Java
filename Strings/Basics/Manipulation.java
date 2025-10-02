package Strings.Basics;

public class Manipulation {
    public static String builder(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        int k = s.length();
        stringBuilder.insert(k,"somala");
        return  stringBuilder.toString();
    }
    public static void main(String[] args){
        System.out.println(builder("Gowtham Reddy"));
    }
}
