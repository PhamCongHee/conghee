package Object;

public class Employer extends Person {
    public static final int NET = 0;
    private static final String POSITION = "NONE";

    private int net;
    private String position;

    public Employer(){
        this(Employer.FIRSTNAME,Employer.LASTNAME,Employer.AGE,Employer.address,Employer.NET,Employer.POSITION);
    }
    public  Employer(String firstName,String lastName,byte age,Address address,int net,String position){
        super(firstName,lastName,age,address);
        this.net = net;
        this.position = position;
    }

    public int getNet() {
        return net;
    }

    public static String getPOSITION() {
        return POSITION;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    @Override
    public String toString(){
        return "Employer [" + super.toString() + " - NET= "+ net+", POSITION= " + position+" ]";
    }

    public static void main(String[] args) {
        Address address = new Address();
        Employer e = new Employer("Công","Phạm",(byte)21,address,1000,"developer" );
        System.out.println(e);
    }
}
