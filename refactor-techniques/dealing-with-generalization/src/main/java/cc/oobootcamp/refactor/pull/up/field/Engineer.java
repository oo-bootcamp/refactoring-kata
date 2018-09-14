package cc.oobootcamp.refactor.pull.up.field;

public class Engineer extends Employee {
    private final String name;

    public Engineer(String name) {
        this.name = name;
    }

    public String getName() {
        return "Engineer " + name;
    }
}

