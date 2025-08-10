package Recursion;

public class RecursionBasics {
     int count = 1;
    public  boolean coder(int k ) {
    // printing name n number of times
        if(k ==0){
            return false;
        }
        System.out.println("Gowtham Reddy");
        k--;
        return coder(k);
    }
    //printing numbers 0 to until n
    public static void print(int k){
    if(k<=1){
        return ;
    }
    k--;
        print(k);
        System.out.print(k+" ");
    }
    public static void printrev(int k){
        if(k==0){
            return;
        }
        System.out.print(k+" ");
        k--;
        printrev(k);
    }
    //sum of first n numbers using recursion
   int noc = 0;
    public int sumofn(int k){
        if(k==0){
            return noc;
        }
        noc = noc + k;
        k--;
        return sumofn(k);
    }
    //factorial of N numbers
    int fact = 1;
    public int factorialofN(int n){
        if(n ==0){
            return fact;
        }
        fact = fact * n;
        n--;
        return factorialofN(n);
    }
    // check if String is palindrome of not
    boolean valid = false;
    public boolean palindrome(String name){
        return false;
    }
    public static void main(String args[]){
       RecursionBasics recursionBasics = new RecursionBasics();
       // System.out.println( recursionBasics.coder(6));
         // print(33);
        //printrev(43);
       // System.out.println(recursionBasics.sumofn(10));
        System.out.println(recursionBasics.factorialofN(10));
    }
}
