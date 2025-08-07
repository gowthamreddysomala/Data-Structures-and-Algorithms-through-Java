package Sorting;

public class InputClass {
    int[] arr = {10,9,3,2,5,32,32,4,6,43,325,3,46,324,5234};

    public int[] getarray(){
            return arr;
    }
    public void printarr(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
