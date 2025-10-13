package Arrays.medium;

public class SlidingWindow {
    public static int max_size(int[] arr,int size){
        int len = arr.length;
        int max = 0;
        // finding the initial size
        for(int i=0;i<size;i++){
            max = max+arr[i];
        }
        // finding the remaining size
        for(int i=size;i<len;i++){
            int temp = max;
            temp = temp - arr[i-size];
            temp = temp + arr[i];
            if(temp>max){
                max = temp;
            }
        }
        return max;
    }
    public static float averageofmaxwindow(int[] arr,int size){
        int len = arr.length;
        float max = 0;
        if(size<=0 || len<2){
            return -1;
        }
        for(int i=0;i<size;i++){
            max = max + arr[i];
        }
        float temp = 0;
        for(int i=size;i<len;i++){
            temp = max;
            temp = temp - arr[i-size];
            temp = temp + arr[i];
            if(temp>max){
                max = temp;
            }
        }
        return max/size;
    }
    public static int patternsanagram(String string,String pattern) {
     int max = 0;
     StringBuffer stringBuffer = new StringBuffer(pattern);
     stringBuffer.reverse();
     String k = stringBuffer.toString();
     int patlen = pattern.length();
     // initial len cal;
     for(int i=0;i<patlen;i++){

     }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int max = max_size(arr,3);
        System.out.println("Max size sum : "+ max);
        float avg = averageofmaxwindow(arr,4);
        System.out.println("Average of Window is : "+ avg);
        System.out.println("Anagram : "+ patternsanagram("gowtham","go"));
    }
}
