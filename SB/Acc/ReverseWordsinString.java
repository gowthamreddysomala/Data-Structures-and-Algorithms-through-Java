package SB.Acc;

public class ReverseWordsinString {
    public static String Reverse(String string){
        String[] strings = string.split(" ");
        int len = strings.length;
        for(int i=0;i<len/2;i++){
            String temp = strings[i];
            strings[i] = strings[len-i-1];
            strings[len-i-1] = temp;
        }
        return new String(String.join(" ",strings));
    }
    public static void main(String[] args){
        String name = "Gowtham Reddy";
        System.out.println(Reverse(name));
    }
}
