package Strings.Basics;

public class VowelsandConsonents {
    public static void count(String name){
        int length = name.length();
        int vowels = 0;
        name = name.toLowerCase();
        for(int i=0;i<length;i++){
            switch(name.charAt(i)){
                case 'a':
                    vowels++;
                    break;
                case 'e':
                    vowels++;
                    break;
                case 'i':
                    vowels++;
                    break;
                case 'o':
                    vowels++;
                    break;
                case 'u':
                    vowels++;
                    break;
            }
        }
        System.out.println("Vowels : " + vowels);
        System.out.println("Consonants " + (length-vowels));
    }
    public static void main(String[] args){
        count("GOWTHAM REDDY");
    }
}
