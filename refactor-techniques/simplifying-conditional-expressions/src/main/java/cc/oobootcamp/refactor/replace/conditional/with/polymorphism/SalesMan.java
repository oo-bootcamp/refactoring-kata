package cc.oobootcamp.refactor.replace.conditional.with.polymorphism;

public class SalesMan extends EmployeeType {
    @Override
    public int getEmployeeCode() {
        return SALESMAN;
    }
}
