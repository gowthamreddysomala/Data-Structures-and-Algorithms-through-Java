package Arrays.easy;

import java.sql.SQLOutput;

public class RemoveDuplicatesfromSortedArray {
    public static int[] removeduplicates(int[] arr){
        int length = arr.length;
        int count = 0;
        for(int i=0;i<length-1;i++){
            if(arr[i]!=arr[i+1]){
            count ++;
            }
        }
        System.out.println("Original Array size :" + length);
        System.out.println("Duplicates Count : " + (length-count) );
        int k =0;
        int[] temp = new int[count];
        for(int i=0;i<length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[k]=arr[i];
                k++;
            }
        }
         return temp;
    }
    public static void main(String[] args){
        int[] arr = InputClass.getinput(1000);
        InputClass.sort(arr);
        InputClass.print(arr);
        System.out.println("After Removing Duplicates :");
       int[] temp = removeduplicates(arr);
        InputClass.print(temp);
    }
}
