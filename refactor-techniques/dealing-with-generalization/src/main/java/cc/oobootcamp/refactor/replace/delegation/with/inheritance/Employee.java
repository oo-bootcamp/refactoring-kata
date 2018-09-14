package cc.oobootcamp.refactor.replace.delegation.with.inheritance;

public class Employee {
    private final Person person = new Person();

    public String GetName() {
        return person.GetName();
    }

    public void SetName(String arg) {
        person.SetName(arg);
    }

    public String Statement() {
        return "Emp: " + person.GetLastName();
    }
}
