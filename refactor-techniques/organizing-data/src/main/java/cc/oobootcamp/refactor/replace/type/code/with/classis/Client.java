package cc.oobootcamp.refactor.replace.type.code.with.classis;

public class Client {
    public void updateBloodGroup() {
        Person person = new Person(Person.AB);
        int bloodGroup = person.getBloodGroup();
    }
}
