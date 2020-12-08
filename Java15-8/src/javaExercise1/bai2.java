package javaExercise1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        m= sc.nextInt();
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==m-1)
                {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
