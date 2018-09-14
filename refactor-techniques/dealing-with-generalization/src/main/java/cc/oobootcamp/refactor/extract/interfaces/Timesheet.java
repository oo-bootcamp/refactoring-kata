package cc.oobootcamp.refactor.extract.interfaces;

public class Timesheet {
    public double charge(Employee employee, int days) {
        int baseCharge = employee.getRate() * days;
        if (employee.hasSpecialSkill())
            return baseCharge * 1.05;

        return baseCharge;
    }
}
