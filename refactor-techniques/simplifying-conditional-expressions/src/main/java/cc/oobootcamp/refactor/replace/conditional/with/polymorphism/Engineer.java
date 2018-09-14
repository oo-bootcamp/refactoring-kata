package cc.oobootcamp.refactor.replace.conditional.with.polymorphism;

public class Engineer extends EmployeeType {

    @Override
    public int getEmployeeCode() {
        return ENGINEER;
    }
}
