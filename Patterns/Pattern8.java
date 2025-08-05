package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=i;k<size;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    }
