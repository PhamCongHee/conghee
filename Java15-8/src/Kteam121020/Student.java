package Kteam121020;

public class Student extends Person{
    private final String universityName;

    public Student(String name, int age, float heigt, String universityName){
        super(name,age,heigt);
        this.universityName = universityName;
    }
    public void getInfo(){
        super.getInfo();
        System.out.println("University Name: " + this.universityName);
    }

    public static void main(String[] args) {
        Student student = new Student("Coong",102,65.05f,"DHCNHN");
        student.getInfo();
    }
    @Override
    public Object clone() {
        Student other = new Student(this.name, this.getAge(), this.height, this.universityName);
        return other;
    }
}
