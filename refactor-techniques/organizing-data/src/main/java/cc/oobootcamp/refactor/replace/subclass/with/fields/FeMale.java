package cc.oobootcamp.refactor.replace.subclass.with.fields;

public class FeMale extends Person {
    @Override
    protected boolean isMale() {
        return false;
    }

    @Override
    public String getCode() {
        return "F";
    }
}
