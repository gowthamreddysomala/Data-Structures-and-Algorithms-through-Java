package Patterns;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            char count = 'A';
            for(int j=0;j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    }
