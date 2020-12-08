package process;

import java.util.*;
import Object.*;

public class MyCollections {
    public static ArrayList<Person> sortedByAge(Person[] list){
        //CHuyển mảng tĩnh sang tập hợp
        ArrayList<Person> tmp = new ArrayList<>(list.length);
        Collections.addAll(tmp, list);

        Collections.sort(tmp);

        //Sắp xếp

        return tmp;
    }

    public static ArrayList<Person> sortedByName(Person[] list){
        //CHuyển mảng tĩnh sang tập hợp
        ArrayList<Person> tmp = new ArrayList<>(list.length);
        Collections.addAll(tmp, list);

        Collections.sort(tmp, new byName());

        //Sắp xếp

        return tmp;
    }

    public static void main(String[] args) {
        Person[] list = MyArrays.generatePerson(20);
        ArrayList<Person> tmp = new ArrayList<Person>();
        //tmp = MyCollections.sortedByAge(list);
        tmp = MyCollections.sortedByName(list);
        System.out.println(tmp);
    }
}
class byName1 implements Comparator<Person>{

    @Override
    public int compare(Person p1,Person p2) {
        return 0;
    }
}