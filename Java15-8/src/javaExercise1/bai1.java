package javaExercise1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();//do dai
        n=sc.nextInt();//do rong
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
