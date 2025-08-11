package Hashing;

public class FreqencyofelementsinArray {
    // Bruteforce Approach
    public int numberfrequency(int array[] , int number){
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(array[i] == number){
                count ++;
            }
        }
        return count;
    }
    int[] hashed = new int[13];

    boolean generated = false;
    // hashing approach
    public int hashingapproach(int[] arr , int number){
        if(generated == false) {
            for (int i = 0; i < arr.length; i++) {
                int k = arr[i];
                hashed[k] = hashed[k] + 1;
            }
            System.out.println("Generated hash array");
            generated = true;
        }
        return hashed[number];
    }
    public static void main(String args[]){
        FreqencyofelementsinArray freqencyofelementsinArray = new FreqencyofelementsinArray();
        InputClass inputClass = new InputClass();
        int[] arr= inputClass.getarray();
       // System.out.println("The Frequency is :" +
           //     freqencyofelementsinArray.numberfrequency(arr , 32));
        // using the defined array so i dont break code cuz it depends on array indexes
        int[] array= {2,3,2,2,3,4,5,2,5,6,12,4};

        int num =  freqencyofelementsinArray.hashingapproach(array,2);
        System.out.println("The Frequency in array is : "+ num);
        num =  freqencyofelementsinArray.hashingapproach(array,3);
        System.out.println("The Frequency in array is : "+ num);
        num =  freqencyofelementsinArray.hashingapproach(array,12);
        System.out.println("The Frequency in array is : "+ num);


    }
}
