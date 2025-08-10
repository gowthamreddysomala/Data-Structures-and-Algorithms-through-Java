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
    if(k==0){
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
    public static void main(String args[]){
       RecursionBasics recursionBasics = new RecursionBasics();
       // System.out.println( recursionBasics.coder(6));
        //  print(33);
        printrev(43);
    }
}
