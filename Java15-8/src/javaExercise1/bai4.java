package javaExercise1;

import java.util.Random;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        int input;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        input = sc.nextInt();
        while (true)
        {
            int randNumber = random.nextInt(100);
            System.out.println("randNumber " + randNumber + ", input: " + input);
            count++;
            if(randNumber==input){
                System.out.println("Thuc hien " + count + " lan.");
                break;
            }
        }
    }
}
