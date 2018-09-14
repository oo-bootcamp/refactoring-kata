package cc.oobootcamp.refactor.replace.subclass.with.fields;

public class Male extends Person {
    @Override
    protected boolean isMale() {
        return true;
    }

    @Override
    public String getCode() {
        return "M";
    }
}
