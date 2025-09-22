package Arrays.easy;

public class MergeTwoSortedArrays {
    // to sort the arrays using merge sort
    public static void sort(int[] arr){
        int length = arr.length;
        if(length<2){
            return;
        }
        int half = length/2;
        int[] left = new int[half];
        int[] right = new int[length-half];
        for(int i=0;i<half;i++){
            left[i] = arr[i];
        }
        for(int i=half;i<length;i++){
            right[i-half] = arr[i];
        }
        sort(left);
        sort(right);
        int leftlen = left.length;
        int rightlen = right.length;
         int m=0,l=0,r=0;
         while(l<leftlen && r<rightlen){
             if(left[l]<right[r]){
                 arr[m] = left[l];
                 l++;
                 m++;
             }else{
                 arr[m] = right[r];
                 r++;m++;
             }
         }
         while(l<leftlen){
             arr[m] = left[l];
             m++;l++;
         }
         while(r<rightlen){
             arr[m] = right[r];
             r++;m++;
         }
    }
    // two merge arrays
    public static int[] merge(int[] arr1 , int[] arr2){
        int ll = arr1.length;
        int rr = arr2.length;
        int[] temp = new int[ll+rr];
        int m = 0,l=0,r=0;
        while(l<ll && r<rr){
            if(arr1[l]<arr2[r]){
                temp[m] = arr1[l];
                l++;
            }else{
                temp[m] = arr2[r];
                r++;
            }
            m++;
        }
        while(l<ll){
            temp[m] = arr1[l];
            m++;l++;
         }
        while(r<rr){
            temp[m] = arr2[r];
            r++;m++;
        }
        return temp;
    }
    public static void main(String[] args){
        int count1 = 10;
        int count2 = 13;
        int[] arr1 = InputClass.getinput(count1);
        int[] arr2 = InputClass.getinput(count2);
        System.out.println("Before Sorting Arrays :");
        InputClass.print(arr1); InputClass.print(arr2);
        sort(arr1);
        sort(arr2);
        System.out.println("After Sorting Arrays :");
        InputClass.print(arr1); InputClass.print(arr2);
        System.out.print("After Merging : ");
        int[] out = merge(arr1,arr2);
        InputClass.print(out);
     }

}
