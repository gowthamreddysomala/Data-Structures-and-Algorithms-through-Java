package Strings.Basics;

public class DuplicatesinString {
    public static void duplicatechar(String string){
        int length = string.length();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(string.charAt(i)==string.charAt(j)){
                    System.out.print(string.charAt(i));
                }
            }
        }

    }
    public static void main(String[] args){
        duplicatechar("sreevalli");
    }
}
