package week1.question10.entity;

import java.util.ArrayList;

public class Customer {
    private static int counter = 0; //Default to 0
    private int customerId;
    private String customerName;
    private int customerAge;
    private ArrayList<Order> orders;

    public Customer(String customerName, int customerAge) {
        setCustomerId(counter);
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.orders = new ArrayList<>();
        counter++;
    }

    public Customer(String customerName, int customerAge, ArrayList<Order> orders) {
        setCustomerId(counter);
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.orders = orders;
        counter++;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
