package baiTap;

import process.MyArrays;

public class ArrayList<S> {
    public static int[][] generateArray(int rows,int cols){
        int[][] arrInt = new int[rows][cols];
        for (int i=0;i<rows;i++){
            arrInt[i] = MyArrays.generateArray(cols);
        }
        return arrInt;
    }
    public static int[] filterArray(int[][] arrInt, int rows, int cols){
        int sum=0,t=0;
        arrInt = ArrayList.generateArray(rows,cols);
        int temp1[] = new int[100];
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                sum+=arrInt[i][j];
            }
        }
        float TBC = (float)sum/(cols*rows);
        int value=0;
        System.out.println("TBC: " + TBC);
        for(int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (arrInt[i][j]<TBC){
                    value = arrInt[i][j];
                    temp1[t++] = value;
                }
            }
        }
        return temp1;
    }
//    public static int[] filterArray(int arrInt[][]){
//        int t=0;
//        int m=0;
//        int n = 0;
//        arrInt = new int[m][n];
//        int value = 0;
//        int temp1[] = new int[100];
//        for(int i=0;i<arrInt.length;i++){
//            for (int j=0;j<arrInt.length;j++){
//                if (arrInt[i][j]<ArrayList.TBC(arrInt)){
//                     value = arrInt[i][j];
//                    temp1[t++] = value;
//                }
//            }
//        }
//        for (int i=0; i < temp1.length; i++){
//            temp1[i] = 0;
//        }
//        return temp1;

    public static void printArray(int[][] arrInt){
        for (int[] row: arrInt){
            MyArrays.printArray(row);
        }
    }
    public static void main(String[] args) {
        int[][] arrInt = ArrayList.generateArray(3,3);
        //In ra
        //MyArrays.printArray(arrInt);

        //sap xep
        // arrInt = MyArrays.filterArray(arrInt,true);
        ArrayList.printArray(arrInt);
        //Person[] sv = MyArrays.generatePerson(5);
        //MyArrays.printPerson(sv);

        //System.out.println(TBC(arrInt));
        //filterArray(arrInt,3,3);
        System.out.println(filterArray(arrInt,3,3));
    }
}
