package Kteam121020;

public abstract class Person {
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

    public void setAge(byte age) {
        if (age>=0 && age<=100 ) {
            this.age = age;
        }
    }

    public void setAge(short age) {
        if (age>=0 && age<=100 ) {
            this.age = age;
        }
    }

    public void setAge(long age) {
        if (age>=0 && age<=100 ) {
            this.age = (int) age;
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
