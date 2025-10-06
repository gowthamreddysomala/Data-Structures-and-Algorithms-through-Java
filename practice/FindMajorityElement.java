package practice;

public class FindMajorityElement {
    public static int majority(int[] arr){
        int mem = 0;
        int vote = 0;
        for(int i=0;i<arr.length;i++){
            if(vote==0){
                mem = arr[i];
                vote = 1;
            }
            else if(mem==arr[i]) {
                vote++;
            }else {
                vote--;
            }
        }
        return mem;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,2,2,3,5,2,6,45,45,3,24,3,2,33,4,3,2,2};
        System.out.println(majority(arr));
    }
}
