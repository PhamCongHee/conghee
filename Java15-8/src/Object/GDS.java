package Object;

import  java.util.*;

public interface GDS {
    public List<Person> searchPerson();
    public List<Person> searchPerson(Person similar);
    public List<Person> searchPerson(byte min_age,byte max_age);
}
