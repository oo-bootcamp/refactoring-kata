package cc.oobootcamp.refactor.replace.conditional.with.polymorphism;

public class Manager extends EmployeeType {
    @Override
    public int getEmployeeCode() {
        return MANAGER;
    }
}
