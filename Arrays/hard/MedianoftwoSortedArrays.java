package Arrays.hard;

public class MedianoftwoSortedArrays {
    public static float median(int[] arr1,int[] arr2){
    float median = 0;
    int left = arr1.length;
    int right = arr2.length;
    int length = left+right;
    int[] temp =new int[length];
    int l=0,r=0,m=0;
    while(l<left && r<right){
        if(arr1[l]<arr2[r]){
            temp[m] = arr1[l];
            l++;m++;
        }else{
            temp[m] = arr2[r];
            m++;r++;
        }
    }
    while(l<left){
        temp[m] = arr1[l];
        l++;
        m++;
    }
    while(r<right){
        temp[m] = arr2[r];
        m++;r++;
    }
    boolean iseven = false;
    if(temp.length%2==0){
        iseven = true;
    }
    if(iseven){
        int t = length/2;
        float k = temp[t]+temp[t-1];
        float tt = k/2;
        median = tt;
    }else{
        median = temp[temp.length/2];
    }
    return median;
    }
    public static void main(String[] args){
        int[] arr1={1, 3, 5, 7, 9};
        int[] arr2={2, 4, 6, 8};
        System.out.println("Median is :" + median(arr1,arr2));
    }
}
