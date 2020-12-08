package OOP;

public class Student extends Person implements Istudy {
    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }


    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:"+this.universityName);
    }
    @Override
    public void study(){
        System.out.println(this.name+" is studing");
    }
    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println(this.name+" is speaking");
    }
    @Override
    public Object clone() {
        Student other = new Student(this.name, this.getAge(), this.height, this.universityName);
        return other;
    }

    public static void main(String[] args) {
        Student s = new Student("Công",1001,101,"Hanoi University of Industry");
        s.getInfo();
    }
}
