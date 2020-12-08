package Object;

public class  Person implements Comparable<Person> {
    public static final String FIRSTNAME = "No FirstName";
    public static final String LASTNAME = "No LastName";
    public static final byte AGE = 0;

    public static Address address = new Address();

    //Object's properties (fields)
    String firstName;
    String lastName;
    byte age;

    //Constructor methods
    public Person(String firstname, String lastname, byte age){
        //dac biet loai 1
        this.firstName = "No FirstName";
        this.lastName = "No LastName";
        this.age = 0;
        this.address = address;
    }
    public Person(){
        this(Person.FIRSTNAME,Person.LASTNAME,Person.AGE);
    }
    public Person(byte age){
        this.firstName = "No FirstName";
        this.lastName = "No LastName";
        this.age = age;
        this.address = address;
    }

    public  Person(String firstName,String lastName, byte age, Address address){
        //dac biet loai 2
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        //this.address = address; //khong khuyen khich gan theo cach nay
        this.address = new Address(address);

    }
    //Getter methods
    public  String getFirstName(){
        return this.firstName;
    }
    public  String getLastName(){
        return  this.lastName;
    }
    public byte getAge(){
        return this.age;
    }
     public Address getAddress(){
        return this.getAddress();
     }
    //Setter methods
    public Person setFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public Person  setLastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public Person setAge(byte age){
        this.age = age;
        return this;
    }
    public Person setAddress(Address address){
        this.address = address;
        return this;
    }
    public  Person setAddress(String cityName,String districtName,String streetName){
        this.address = new Address(cityName,districtName,streetName);
        return this;
    }

    public  String toString(){
        return  this.lastName + " " + this.firstName+ ", "+ this.age + "\n ";  //+ this.address.toString();
    }

    public static void main(String[] args) {
        //tao doi tượng(các thể hiện của lớp đối tượng)
        Address addr = new Address("Ha Noi","Bac Tu Liem","Pho Nhon") ;
        Person p;
        Person p1 = new Person();
//      Person p2 = new Person((byte)20);
//        Person p3 = new Person("Công","Phạm Hữu", (byte) 22,addr);
        System.out.println(p1);
    }

    @Override
    public int compareTo(Person p) {
        if (this.age>p.getAge()){

            return 1;
        }else if (this.age<p.getAge()){
            return -1;
        }
        else {
            return 0;
        }
    }
}
