package Object;

public class TestManager {
    public static void main(String[] args) {
        Address address = new Address();
        Person s = new Student("Tuấn","Trần Văn",(byte)19,address,"(2020)0123600000","Công nghệ thông tin");
        Person e = new Employer("Công","Phạm",(byte)21,address,10_000_000,"developer" );
        System.out.println(s.toString());
        System.out.println(e.toString());

        Manager st = new StudentManager();
        Manager em = new EmployerManager();
        System.out.println(st.getInfo(s));
        System.out.println(em.getInfo(e));
    }
}
