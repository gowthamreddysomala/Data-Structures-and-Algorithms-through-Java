package Patterns;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]) {
        System.out.println("Enter size of elements :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=size;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    }
