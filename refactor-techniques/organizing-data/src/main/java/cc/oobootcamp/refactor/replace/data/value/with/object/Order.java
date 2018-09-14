package cc.oobootcamp.refactor.replace.data.value.with.object;

public class Order {
    private String customer;

    public Order(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }
}
