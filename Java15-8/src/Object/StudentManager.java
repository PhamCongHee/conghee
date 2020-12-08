package Object;

public class StudentManager extends Manager {
    @Override
    public String getInfo(Person p){

        return "S: " + p.toString();
    }
}
