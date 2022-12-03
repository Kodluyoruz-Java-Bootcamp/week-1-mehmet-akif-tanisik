package week1.question10.entity;

import java.util.ArrayList;

public class Order {
    private static int counter = 0; //Default to 0
    private int orderId;
    private ArrayList<Product> products;
    private Invoice invoice;

    public Order(){
        setOrderId(counter);
        counter++;
        this.products = new ArrayList<>();
        this.invoice = new Invoice(this);
    }

    public Order(ArrayList<Product> products) {
        setOrderId(counter);
        this.products = products;
        this.invoice = new Invoice();
        counter++;
    }

    public Order(ArrayList<Product> products, Invoice invoice) {
        setOrderId(counter);
        this.products = products;
        this.invoice = invoice;
        counter++;
    }

    public void setInvoiceAmount(){
        int total = 0;
        for (Product element: products){
            total += element.getPrice();
        }
        this.invoice.setInvoiceAmount(total);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public void addProduct(Product product){
        products.add(product);
        setInvoiceAmount();
    }

    @Override
    public String toString() {
        return "OrderId:" + orderId +" Products:" + products +" Invoice:" + invoice;
    }
}
