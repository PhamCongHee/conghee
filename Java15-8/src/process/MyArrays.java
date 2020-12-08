package process;

import Exam.Examples7;
import Object.Person;
import java.util.*;
public class MyArrays {
    /**
     * Đây là phương thức sinh<b> mgaaux nhiên giá trị </b>mảng 1 chiêu
     * <br>
     * <i>cập nhật ngay</i>
     * @param
     * @return
     */
    public static int getRandomIntValue(int MAX_VALUE)
    {

        return (int)(Math.random()*MAX_VALUE);
    }
    public static int[] generateArray(int n){
        int[] arrInt = new int[n];

        for(int i=0;i<arrInt.length;i++){
            arrInt[i] = MyArrays.getRandomIntValue(100);
            //arrInt[i] = (int)(Math.random()*100);
        }

        return arrInt;
    }

    /**
     * Phương thức sinh ngẫu nhiên giá trị mảng 2 chiều
     * <br>
     * @param rows
     * @param cols
     * @return
     */
    public static int[][] generateArray(int rows,int cols){
        int[][] arrInt = new int[rows][cols];

        for (int i=0;i<rows;i++){
            arrInt[i] = MyArrays.generateArray(cols);
        }

        return arrInt;
    }

    /**
     * Sinh ngẫu nhiên một mảng Persion
     * @param n
     * @return
     */
    public static Person[] generatePerson(int n){

        //Danhsach ten
        String[] firstNames = {
                "Hân","Huyền","Linh","Ngọc","Tuấn","Anh",
                "Hoàng","Hải","Thắng","Quang","Khoa","Diễm","Tĩnh",
                "Oanh","Khôi","Quân","Khuê","Cường"
        };
        String[] lastNames = {
                "Lê","Phạm","Tạ","Bùi","Nguyễn","Cao","Hà","Phan",
                "Phùng","Vũ","Ngô","Trần","Lương","Quách"
        };
        //sinh ngau nhien
        Person[] list = new Person[n];
        int index;
        for(int i=0;i<n;i++){
            //khoi tao bo nho cho tung phan tu mang doi tuong
            list[i] = new Person();

            //ngau nhien chi so cua ten
            index = Examples7.getRandomIntValue(firstNames.length);
            list[i].setFirstName(firstNames[index]);

            //ngau nhien chi so cua ho
            index = Examples7.getRandomIntValue(lastNames.length);
            list[i].setLastName(lastNames[index]);

            //ngau nhien tuoi
            index = 18 + Examples7.getRandomIntValue(5);
            list[i].setAge((byte)index);
        }
        return list;

    }

    public static Person[] sortAge(Person[] list,boolean isINC)
    {
        //Person[] list = MyArrays.generatePerson(10);
        Person temp;
        byte oriented = (byte) (isINC?1:-1);
        for (int i=0;i<=list.length;i++){
            for (int j=i+1;j<list.length;j++){
                if(list[i].getAge()>list[j].getAge()){
                    temp = list[i];
                    list[i]=list[j];
                    list[j] = temp;
                }
            }
        }
      return list;
    }

    public static Person[] sortName(Person[] list)
    {

        //Person[] list = MyArrays.generatePerson(10);
        Person temp;
        for (int i=0;i<=list.length;i++){
            for (int j=i+1;j<list.length;j++){
                if(list[i].getFirstName().charAt(0)>list[j].getFirstName().charAt(0)){
                    temp = list[i];
                    list[i]=list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }



    /**
     * sắp xếp mảng 1 chiều
     * @param arrInt
     * @param isINC
     * @return
     */
    public static int[] sortedArray(int[] arrInt, boolean isINC){
        //xác định hướng sắp xếp
        byte oriented = (byte)(isINC ? 1 : -1);
        int tmp;
        for(int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt.length;j++){
                if(arrInt[i] * oriented > arrInt[j] * oriented){
                    tmp=arrInt[i];//ghi nhan gia tri cua i
                    arrInt[i] = arrInt[j];//chuyen gia tri cua i cho j
                    arrInt[j] = tmp;//lay gia tri cua i ban dau
                }
            }
        }
        return arrInt;
    }
    public static int[][] sortArrayV22(int [][]arrInt,boolean isINC){
        byte oriented = (byte)(isINC?1:-1);
        int temp;
        for (int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt[0].length;j++){
                for (int h=0;h<arrInt.length;h++){
                    for (int k=0;k<arrInt[0].length;k++){
                        if(arrInt[i][j] * oriented < arrInt[h][k] * oriented){
                            temp = arrInt[i][j];
                            arrInt[i][j] = arrInt[h][k];
                            arrInt[h][k] = temp;
                        }
                    }
                }
            }
        }
        return arrInt;
    }

    /**
     * lọc số nguyên tố để lên đầu mảng và sắp xếp theo một thứ tự
     * @param arrInt
     * @param isINC
     * @return
     */
    public static int[] filterArray(int[] arrInt,boolean isINC){
        //swap
        arrInt = MyArrays.sortedArray(arrInt,isINC);

        //tach nguyen to
        int[] temp1 = new int[arrInt.length];//luu nguyen to
        int[] temp2 = new int[arrInt.length];//luu KHONG nguyen to
        int t1=0,t2=0;
        for (int value: arrInt){
            if(Examples7.isPrime(value)){
                temp1[t1++] = value;
            }else {
                temp2[t2++] = value;
            }
        }
        //Ghep mang
        for (int i=t1; i < temp1.length; i++){
            temp1[i]=temp2[i-t1];
        }
        return temp1;
    }

    public static Person[] searchPerson(Person[] list,String name){
        Person[] results = null;
        //Đềm số kết quả
        int count =0;
        for (Person p:list){
            if (p.getFirstName().contains(name)){
                count++;
            }
        }
        //KHởi tạo bộ nhớ
        results = new Person[count];

        //Ghi nhận kết quả
        count = 0;
        for (Person p:list){
            if(p.getFirstName().contains(name)){
                results[count++] = p;
            }
        }

        return results;
    }

    public static void fillArray(int[][] arrInt){
        int sum=0;
        for (int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt[0].length;j++){
                sum += arrInt[i][j];
            }
        }
        float TB = (float)sum/ (arrInt.length* arrInt[0].length);
        System.out.println("TB = " + TB);
        System.out.println("các phần tử nhỏ hơn tb");
        for (int i=0;i<arrInt.length;i++){
            for (int j=0;j<arrInt[0].length;j++){
                if (arrInt[i][j]<TB)
                    System.out.print(arrInt[i][j] + " ");
            }
        }
    }


    public static ArrayList<Person> searchPersonV2(Person[] list,String name){
        //Khai báo mảng kết quả
        ArrayList<Person> results = new ArrayList<>();
        //Ghi nhận
        for (Person p:list){
            if(p.getFirstName().contains(name)){
                results.add(p);
            }
        }
    return results;
    }


    public static void printPerson(ArrayList<Person> list){
        for (Person p:list){
            System.out.println(p);
        }
    }
    public static void printPersonV2(ArrayList persons){
        Person p;
        for (int i=0;i<persons.size();i++){
            p=(Person)persons.get(i);
            System.out.println(p);
        }
    }

    public static void printArrayJ5(int[] arrInt){
        for (int v: arrInt){
            System.out.print(v+ " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arrInt){
        for (int[] row: arrInt){
            MyArrays.printArray(row);
        }
    }
    public static void sortArrayV2(int[][] arrInt){
        for (int[] row: arrInt){
            sortedArray(row,true);
        }
    }

    //print methods
    public static void printArray(int[] arrInt){
        for (int i=0;i<arrInt.length;i++){
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
    }

    public static void printPerson(Person[] list){
        for(Person p:list){
            System.out.println(p);
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        int n = 30 + random.nextInt(20);

        //int[][] arrInt = MyArrays.generateArray(5,5);
        //In ra
        //MyArrays.printArray(arrInt);
        //sap xep
       // arrInt = MyArrays.filterArray(arrInt,true);
        //MyArrays.printArray(arrInt);
        Person[] list = MyArrays.generatePerson(n);
        sortAge(list,true);
        //sortName(list);
        MyArrays.printPerson(list);
        //System.out.println("-------------------------------------------");
        //Person[] results = MyArrays.searchPerson(list,"Huyền");
        //ArrayList<Person> results = MyArrays.searchPersonV2(list,"Huyền");
        //MyArrays.printPerson(results);




    }



}
