package cc.oobootcamp.refactor;

import cc.oobootcamp.refactor.model.Order;

public class InlineTemp {
    private final Order order;

    public InlineTemp(int amount) {
        order = new Order(amount);
    }

    public boolean isAmountOver1000() {
        double amount = order.getAmount();
        return amount > 1000;
    }
}
