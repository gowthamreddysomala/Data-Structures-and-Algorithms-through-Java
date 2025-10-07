package practice;

public class FindMajorityElement {
    public static int majority(int[] arr){
        int value = 0;
        int vote =0;
        int len = arr.length;
        for(int i=0;i<len;i++){
            if(vote==0){
                value = arr[i];
                vote =1;
            }
            if(arr[i]==value){
                vote++;
            }else{
                vote--;
            }
        }
        return value;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,2,2,3,5,2,6,45,45,3,24,3,2,33,4,3,2,2};
        System.out.println(majority(arr));
    }
}
