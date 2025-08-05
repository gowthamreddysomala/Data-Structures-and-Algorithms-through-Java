package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){ // or condition : for(int j=0;j<size-i-1;j++)
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    }
