package BasicMath;

public class StringPalindrome {
    public boolean check_palindrome(String word){
        StringBuffer stringBuffer = new StringBuffer(word);
        stringBuffer.reverse();
        String Reversed = stringBuffer.toString();
        if(Reversed.equals(word)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        StringPalindrome stringPalindrome = new StringPalindrome();
        System.out.println("Checking the String :"
                + stringPalindrome.check_palindrome("Gowtham"));

    }
}
