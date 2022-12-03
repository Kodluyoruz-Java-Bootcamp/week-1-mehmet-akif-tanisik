package week1.question10.view;

import week1.question10.controller.StoreController;
import week1.question10.entity.Customer;
import week1.question10.entity.Invoice;
import week1.question10.entity.Order;
import week1.question10.entity.Product;

public class StoreView {
    /**
     * singleInstance of storeController object
     */
    private final StoreController storeController;

    /**
     * No argument constructor to initialize storeController object
     */
    public StoreView(){
        this.storeController = StoreController.getInstance();
    }

    /**
     * Adds customer object to the customers list of StoreController
     * @param customer object
     */
    public void addCustomer(Customer customer){
        storeController.addCustomer(customer);
    }

    /**
     * Adds product object to the products list of StoreController
     * @param product object
     */
    public void addProduct(Product product){
        storeController.addProduct(product);
    }

    /**
     * Adds order object to the orders list of StoreController
     * @param order object
     */

    public void addOrder(Order order){
        storeController.addOrder(order);
    }

    /**
     * Adds invoice object to the invoices list of StoreController
     * @param invoice object
     */
    public void addInvoice(Invoice invoice){
        storeController.addInvoice(invoice);
    }

    /**
     * Prints total customer number in the system
     */
    public void getCustomerSize(){

        System.out.println("Total customer number: " + storeController.getCustomerSize());

    }

    /**
     * Prints total number of products bought by customers whose names are Cem
     */
    public void getProductNumberCemsBought(){

        System.out.println("Total product number purchased by customers whose name is 'Cem' : " +
                storeController.getProductNumberCemsBought());

    }

    /**
     * Prints total amount of invoices of customers whose names are 'Cem'
     * and their ages are between 25 and 30.
     */
    public void getTotalInvoiceCems(){

        System.out.println("Total invoice amount (Name=\"Cem\" Age>25 Age<30): " + storeController.getTotalInvoiceCems());

    }

    /**
     * Prints list of invoices that are greater than 1500 TL.
     */
    public void getInvoicesGreaterThan1500(){

        System.out.println("Invoices list over 1500 TL: ");

        for (Invoice element: storeController.getInvoicesGreaterThan1500()){
            System.out.println(element);
        }
    }
}
