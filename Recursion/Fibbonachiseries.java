package Recursion;

public class Fibbonachiseries {
    public void Iteratives(int k){
       int t1 = 0; int t2 = 1;
        for(int i=0;i<k;i++){
            System.out.println(t1+" ");
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
    }
    // counting no of digits
    public int count(int k){
        int t1 = 0;
        int t2 = 1;
        int t3 =0;
        int counter = 0;
        for(int i=0;i<k;i++){
            counter = t3;
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
        System.out.println(counter);
        return counter;
    }


    public void recursiveapp(int k){
        if(k<=1){
            return;
        }
    }
    public static void main(String args[]){
        Fibbonachiseries fibbonachiseries = new Fibbonachiseries();
      //  fibbonachiseries.Iteratives(7);
        //counting the digits in fibbo
        fibbonachiseries.count(2);
    }
}
