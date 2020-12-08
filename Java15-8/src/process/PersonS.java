package process;

import OOP.Person;

import java.io.*;

public class PersonS implements Serializable{
    public static int numPerson = 0;
    int idPerson;
    PersonS next;

    public PersonS()
    {
        PersonS.numPerson++;
        this.idPerson = numPerson;
        if(numPerson <= 10){
            this.next = new PersonS();
        }else {
            this.next=null;
        }
    }


    @Override
    public String toString() {
        return "Object: " + this.idPerson;
    }

    public static void main(String[] args) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("abc.txt"));
            PersonS p = new PersonS();
            out.writeObject(p);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("abc.txt"));
            PersonS p1 = (PersonS) in.readObject();
            in.close();

            while ( p1 != null) {
                System.out.println(p1);
                p1 = p1.next;
            }
        }
         catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
