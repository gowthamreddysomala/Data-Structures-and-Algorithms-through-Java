package Arrays.easy;

public class Checkifarrayissorted {
    public static boolean checksort(int arr[]){
        int size =arr.length;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int count = 20;
        int[] arr = new int[count];
     //   arr = InputClass.getinput(count);
        for(int i=0;i<count;i++){
            arr[i] = i;
            System.out.println(arr[i]);
        }
        System.out.println("is sorted : " + checksort(arr));
    }
}
