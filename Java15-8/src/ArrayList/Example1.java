package ArrayList;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        // khai báo 1 ArrayList có tên là list
        // có kiểu là String
        ArrayList<String> list = new ArrayList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("ví dụ sử dụng phương thức addAll()");
        System.out.println("-----------------------------------");
        // thêm các phần tử của list vào listA
        ArrayList<String> listA = new ArrayList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương thức retainAll()");
        System.out.println("-----------------------------------");
        // khởi tạo listB
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Java");
        // xóa những phần tử không thuộc listB khỏi listA
        listA.retainAll(listB);
        System.out.print("listA:");
        showList(listA);

        System.out.println("\nví dụ sử dụng phương thức removeAll()");
        System.out.println("-----------------------------------");
        // xóa những phần tử thuộc listB  khỏi list
        list.removeAll(listB);
        System.out.print("list:");
        showList(list);
    }

    public static void showList(ArrayList<String> list) {
        // Show list through for-each
        for (String obj : list) {
            System.out.print("\t" + obj + ", ");
        }
        System.out.println();
    }
}
