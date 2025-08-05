package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = 0;
        for(int i=0;i<size;i++){
            if(i%2==0){
                count = 1;
            }else{count = 0;}
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                if(j%2==0){
                    count = 1;
                }else{count = 0;}
            }
            System.out.println();
        }
    }
    }
