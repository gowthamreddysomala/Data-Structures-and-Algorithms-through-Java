package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=0;j<size-i-1;j++){
                System.out.print("    ");
            }
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
    }
