package Object;

public class EmployerManager extends Manager{

    @Override
    public String getInfo(Person p)
    {
        return "E: " + p.toString();
    }
}
