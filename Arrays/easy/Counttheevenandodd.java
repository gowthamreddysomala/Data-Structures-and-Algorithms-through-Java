package Arrays.easy;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class Counttheevenandodd {
    public static int odd(int[] arr){
        int odd = 0;
        int m = arr.length;
        for(int i=0;i<m;i++){
            if(arr[i]%2!=0){
                odd++;
                continue;
            }
        }
        return odd;
    }
    public static int even(int[] arr){
        int even = 0;
        int m = arr.length;
        for(int i=0;i<m;i++){
            if(arr[i]%2==0){
                even++;
                continue;
            }
        }
        return even;
    }
    public static void main(String[] args){
        System.out.println("Odd Count "+ odd(InputClass.getinput(100)));
        System.out.println("Even Count "+ even(InputClass.getinput(100)));
    }
}
