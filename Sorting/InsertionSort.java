package Sorting;

public class InsertionSort {
    public static void main(String args[]){
        InputClass inputClass = new InputClass();
        int[] arr = inputClass.getarray();
        inputClass.printarr(arr);

        //insertion sort
            int size = arr.length;
            for(int i=1;i<size;i++){
                int temp = arr[i];
                int j = i-1;
                while( j>=0 && arr[j]>temp){
                    arr[j+1] = arr[j];
                    j--;
                }
                arr[j+1] = temp;
            }
            inputClass.printarr(arr);
    }
}
