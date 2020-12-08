package Object;

import process.MyArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BaiSo2 {
    private static List<Student> list;
    public static boolean addStudent(Student p)
    {
        list.add(p);
        return true;
    }
    public boolean editStudent(Student s) {
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
                   return true;
            }
        return false;
    }

    public static boolean delStudent(Student s) {
            for (int i = 0; i < list.size(); i++) {
                Student t = list.get(i);
                if (t.getId() == s.getId()) {
                    list.remove(i);
                }
            }
            return true;
    }
    public static ArrayList<Student> searchPersonV2(Student[] list, String name){
        //Khai báo mảng kết quả
        ArrayList<Student> results = new ArrayList<>();
        //Ghi nhận
        for (Student p:list){
            if(p.getFirstName().contains(name)){
                results.add(p);
            }
        }
        return results;
    }
    public static void main(String[] args) {
        list = new ArrayList<Student>();
        Address address = new Address("Hà nội","Nam TỪ Liêm","Tây Mỗ");
        Student st = new Student("Tun","Trần Văn",(byte)19,address,"(2020)0123600000","Công nghệ thông tin");
        Student st1 = new Student("Tuấn","Trần Văn T",(byte)19,address,"(2020)0123600001","Công nghệ thông tin");
        Student st2 = new Student("Tấn","Trần",(byte)19,address,"(2020)0123600002","Công nghệ thông tin");
        addStudent(st);
        addStudent(st1);
        addStudent(st2);
        for (Student s:list) {
            System.out.println(s);

        }
    
    }
}
