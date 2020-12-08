package OOP;

public abstract class Person implements Ispeak{
    public String name;
    private int age;
    public float height;

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age) {
        if (age>=0 && age<=100 ) {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }

    public abstract Object clone();

    public void getInfo() {
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
    }
}
