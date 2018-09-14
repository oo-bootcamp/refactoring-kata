package cc.oobootcamp.refactor.pull.up.field;

public class Salesman extends Employee {
    private final String name;

    public Salesman(String name) {
        this.name = name;
    }

    public String getName() {
        return "Salesman " + name;
    }
}
