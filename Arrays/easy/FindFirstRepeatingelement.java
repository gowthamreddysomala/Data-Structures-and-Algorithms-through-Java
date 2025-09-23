package Arrays.easy;

public class FindFirstRepeatingelement {
    public static int repeatingelement(int[] arr){
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        System.out.println("first Repeating element : " + repeatingelement(InputClass.getinput(100)));
    }
}
