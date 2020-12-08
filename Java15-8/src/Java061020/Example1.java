package Java061020;

import Exam.Examples7;
import process.MyArrays;

public class Example1 {
    public static int[] generateArray(int n){
        int[] arrInt = new int[n];

        for(int i=0;i<arrInt.length;i++){
            arrInt[i] = Examples7.getRandomIntValue(100);
            //arrInt[i] = (int)(Math.random()*100);
        }

        return arrInt;
    }
    public static int[][] generateArray(int rows,int cols){
        int[][] arrInt = new int[rows][cols];

        for (int i=0;i<rows;i++){
            arrInt[i] = Example1.generateArray(cols);
        }

        return arrInt;
    }
    public static void printArray(int[] arrInt){
        for (int i=0;i<arrInt.length;i++){
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
    }
    public static void printArray(int[][] arrInt){
        for (int[] row: arrInt){
            Example1.printArray(row);
        }
    }
    public static void main(String[] args) {
        int[][] arrInt = MyArrays.generateArray(10,10);
        Example1.printArray(arrInt);
    }
}
