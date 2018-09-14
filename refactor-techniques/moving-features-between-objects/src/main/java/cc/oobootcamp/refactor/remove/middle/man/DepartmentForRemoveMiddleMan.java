package cc.oobootcamp.refactor.remove.middle.man;

public class DepartmentForRemoveMiddleMan {
    private final PersonForRemoveMiddleMan manager;

    public DepartmentForRemoveMiddleMan(PersonForRemoveMiddleMan manager) {
        this.manager = manager;
    }

    public PersonForRemoveMiddleMan getManager() {
        return manager;
    }
}
