package Recursion;
// from striver
public class RecursionBasics {
    // print name 5 Times
    public static void printname(int n){
        if(n>=5){
            return;
        }
        System.out.println("Gowtham Reddy");
        printname(++n);
    }
    // print linearly from 1 to n
    public static void printn(int n,int num){
        if(num >= n){
            return;
        }
        System.out.print(num+" ");
        printn(n,++num);
    }
    /// print from n to 1
    public static void nto1(int n){
        if(n<=0){
            return;
        }
        System.out.print(n+" ");
        nto1(--n);
    }
    // print linearly from 1 to n but by backtracking
    public static void backtrck1ton(int n){
        if(n<=1 ){
            return;
        }
        backtrck1ton(--n);
        System.out.print(n + " ");
    }
    // printing 1 to n by backtracking
    public static void backtrackingnto1(int n,int c){
        if(c>=n){
            return;
        }
        backtrackingnto1(n,++c);
        System.out.print(c+" ");
    }
    public static void main(String args[]){
        printname(0);
        System.out.println();
        printn(10,1);
        System.out.println();
        nto1(10);
        System.out.println();
        backtrck1ton(19);
        System.out.println(
        );
        backtrackingnto1(132,0);
    }
}
