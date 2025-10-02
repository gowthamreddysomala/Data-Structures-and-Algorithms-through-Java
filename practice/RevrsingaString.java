package practice;


public class RevrsingaString {
    public static String reverse(String string){
        char[] arr = string.toCharArray();
        int length = arr.length;
        for(int i=0;i<length/2;i++){
            char temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
        return new String(arr);
    }
    public static void main(String[] args){
        String name = "Gowtham";
        String reversed = reverse(name);
        System.out.println("String Reversing "+name+" "+reversed);
    }
}
