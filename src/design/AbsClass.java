package design;

public abstract class AbsClass implements Employee {

    public final String CompanyName ="ALWAYS SATURDAY";
    public String owner = "This fool";

    public void whoOwns(){
        System.out.println(CompanyName + "is owned by "+owner);
    }

    public abstract void whenItWasFounded(int Year);

}
