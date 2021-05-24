package me.escoffier.quarkus.coffeeshop;

public class Beverage {

    private String beverage;
    private String customer;
    private String preparedBy;
    private String orderId;
    private BeverageState preparationState;

    public Beverage() {

    }

    public Beverage(Order order, String baristaName) {
        this.beverage = order.getProduct();
        this.customer = order.getName();
        this.orderId = order.getOrderId();
        this.preparedBy = baristaName;
    }

    public String getBeverage() {
        return beverage;
    }

    public Beverage setBeverage(String beverage) {
        this.beverage = beverage;
        return this;
    }

    public String getCustomer() {
        return customer;
    }

    public Beverage setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public Beverage setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public Beverage setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public BeverageState getPreparationState() {
        return preparationState;
    }

    public void setPreparationState(BeverageState preparationState) {
        this.preparationState = preparationState;
    }
}
