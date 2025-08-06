package Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    }
