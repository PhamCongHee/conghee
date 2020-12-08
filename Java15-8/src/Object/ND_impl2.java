package Object;

import java.util.ArrayList;
import java.util.List;

public class ND_impl2 implements ND,CTT,CTX{

    @Override
    public String getInfo(Person p) {
        return null;
    }

    @Override
    public boolean addPerson(Person p) {
        return false;
    }

    @Override
    public boolean editPerson(Person p) {
        return false;
    }

    @Override
    public boolean delPerson(Person p) {
        return false;
    }

    @Override
    public ArrayList<Person> countPerson() {
        return null;
    }

    @Override
    public ArrayList<Person> countPerson(byte age) {
        return null;
    }

    @Override
    public ArrayList<Person> countPerson(Address address) {
        return null;
    }

    @Override
    public ArrayList<Person> countPerson(Person similar) {
        return null;
    }

    @Override
    public ArrayList<Person> countPerson(Person[] list) {
        return null;
    }

    @Override
    public List<Person> searchPerson() {
        return null;
    }

    @Override
    public List<Person> searchPerson(byte min_age, byte max_age) {
        return null;
    }

    @Override
    public List<Person> searchPerson(Person similar) {
        return null;
    }

    @Override
    public ArrayList<Person> statisticPerson(Person[] list) {
        return null;
    }

    @Override
    public ArrayList<Person> statisticPerson(Address address) {
        return null;
    }
}
