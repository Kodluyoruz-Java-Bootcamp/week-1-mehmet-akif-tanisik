package week1.question10.controller;

import week1.question10.entity.Customer;
import week1.question10.entity.Invoice;
import week1.question10.entity.Order;
import week1.question10.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreController {
    /**
     * Single instance to control all business logic about store
     */
    private static StoreController singleInstance = null;
    /**
     * Customers List to store customers object
     */
    private final ArrayList<Customer> customers;
    /**
     * Products List to store customers object
     */
    private final ArrayList<Product> products;
    /**
     * Orders List to store customers object
     */
    private final ArrayList<Order> orders;
    /**
     * Invoices List to store customers object
     */
    private final ArrayList<Invoice> invoices;

    /**
     * No argument constructor that will instantiate new lists
     */
    private StoreController(){
        this.customers = new ArrayList<>();
        this.products = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    /**
     * If instance has not been created, this method will create new instance
     * If instance has been created, this method will return created instance.
     * @return singleInstance
     */
    public static StoreController getInstance(){
        if (singleInstance==null){
            singleInstance = new StoreController();
        }
        return singleInstance;
    }

    /**
     * Simply sends orders as list
     * @return order list
     */
    public List<Order> getOrders(){
        return orders;
    }

    /**
     * Adds Customer object to the customers list
     * @param customer is a Customer object that will be added in customers list
     */
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    /**
     * Adds Product object to the products list
     * @param product is a Product object that will be added in products list
     */
    public void addProduct(Product product){
        products.add(product);
    }

    /**
     * Adds Order object to the orders list
     * @param order is an Order object that will be added in orders list
     */
    public void addOrder(Order order){
        orders.add(order);
    }

    /**
     * Adds Invoice object to the invoices list
     * @param invoice is an Invoice object that will be added in invoices list
     */
    public void addInvoice(Invoice invoice){
        invoices.add(invoice);
    }

    /**
     * Sends current size of the customers list
     * @return size of the customers list
     */
    public int getCustomerSize(){
        return customers.size();
    }

    /**
     * Calculates the total number of products that customers whose names are 'Cem' bought
     * @return total number of products
     */
    public int getProductNumberCemsBought(){
        int total = 0;

        for (int i = 0 ; i<customers.size(); i++){
            if (customers.get(i).getCustomerName().equalsIgnoreCase("Cem")){

                for (Order element: customers.get(i).getOrders()){
                    total+=element.getProducts().size();
                }
            }
        }
        return total;
    }

    /**
     * Calculates total amount of invoices of customers whose names are 'Cem' and
     * their ages are between 25 and 30.
     * @return total amount of invoices
     */
    public double getTotalInvoiceCems(){
        double totalInvoice = 0;

        for (int i = 0 ; i<customers.size(); i++){
            if (customers.get(i).getCustomerName().equalsIgnoreCase("Cem") &&
                    customers.get(i).getCustomerAge()>25 && customers.get(i).getCustomerAge()<30){

                for (int j = 0; j<customers.get(i).getOrders().size(); j++){
                    totalInvoice += customers.get(i).getOrders().get(j).getInvoice().getInvoiceAmount();
                }
            }
        }

        return totalInvoice;
    }

    /**
     * Finds invoices that are greater than 1500 TL and store them in list.
     * @return list of invoices
     */
    public List<Invoice> getInvoicesGreaterThan1500(){
        List<Invoice> invoicesList = new ArrayList<>();

        for (int i = 0; i<orders.size(); i++){

            if (orders.get(i).getInvoice().getInvoiceAmount() >= 1500){
                invoicesList.add(orders.get(i).getInvoice());
            }
        }

        return invoicesList;
    }
}
