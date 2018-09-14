package cc.oobootcamp.refactor.pull.up.constructor.body;

public class Salesman extends Employee {
    public Salesman(String name, String id) {
        name = name;
        id = id;
        if (isPriviliged()) assignCar();
    }
}
