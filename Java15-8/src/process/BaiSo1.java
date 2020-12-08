package process;

import Exam.Examples7;
import Object.Person;

import java.io.*;
import java.util.Random;

public class BaiSo1 {
    public static Person[] generatePerson(int n){
        Random random = new Random();
        n =30 + random.nextInt(20);
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
    public static void textOutputFile() throws IOException {
        FileWriter OutFileWriter = new FileWriter("test.txt");
        PrintWriter out = new PrintWriter(OutFileWriter);
        Person[] list = MyArrays.generatePerson(30);
        for (Person p:list) {
            out.println(p);
        }
        out.close();
    }
    public static void textInputFile() throws IOException{
        FileReader InFileReader = new FileReader("test.txt");
        BufferedReader in = new BufferedReader(InFileReader);
        String tmpStr;
        for (int i=0;i<50;i++)
        {
            tmpStr = in.readLine();
            System.out.println(tmpStr);
        }
        in.close();
    }
    public static void main(String[] args) {
        Person[] list = MyArrays.generatePerson(30);
        sortAge(list,true);
        //sortName(list);
        MyArrays.printPerson(list);
        try {
            MyFiles.textOutputFile();
            MyFiles.textInputFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
