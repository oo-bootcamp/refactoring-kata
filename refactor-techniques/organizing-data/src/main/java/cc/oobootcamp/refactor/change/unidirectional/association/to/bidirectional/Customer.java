package cc.oobootcamp.refactor.change.unidirectional.association.to.bidirectional;

public class Customer {
    private String name;

    public Customer(String customerName) {
        this.name = customerName;
    }

    public String getName() {
        return name;
    }
}
