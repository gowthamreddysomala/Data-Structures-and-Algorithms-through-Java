package Patterns;

import java.util.Scanner;

public class Pattern9 {
        public static void main(String args[]) {
            System.out.println("Enter size of elements :");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            /// for printing top half
            for(int i=0;i<size;i++){
                for(int j=0;j<size-i-1;j++){
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
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

