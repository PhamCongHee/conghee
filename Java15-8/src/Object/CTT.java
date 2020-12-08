package Object;

import java.util.*;

public interface CTT extends CTX,TPGD,GDS {
    public ArrayList<Person> countPerson();
    public ArrayList<Person> countPerson(Person[] list);
    public ArrayList<Person> countPerson(Person similar);
    public ArrayList<Person> countPerson(Address address);
    public ArrayList<Person> countPerson(byte age);
}
