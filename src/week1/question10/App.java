package week1.question10;
import week1.question10.entity.Customer;
import week1.question10.entity.Order;
import week1.question10.entity.Product;
import week1.question10.view.StoreView;

public class App {

    public static void main(String[] args) {

        StoreView storeView = new StoreView();

        //Product object that will be stored in StoreController
        Product product1 = new Product(5,600,"huawei p20","mobile phone");
        Product product2 = new Product(2,800,"samsung s3","mobile phone");
        Product product3 = new Product(3,400,"iphone 13","mobile phone");
        Product product4 = new Product(1,1200,"macbook air","laptop");
        Product product5 = new Product(7,40,"xiaomi redmi pro","mobile phone");

        //Order objects and adding products to the orders
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);
        Order order2 = new Order();
        order2.addProduct(product3);
        order2.addProduct(product4);
        Order order3 = new Order();
        order3.addProduct(product1);
        order3.addProduct(product5);
        Order order4 = new Order();
        order4.addProduct(product3);
        order4.addProduct(product5);
        order4.addProduct(product4);
        Order order5 = new Order();
        order5.addProduct(product1);
        order5.addProduct(product2);
        order5.addProduct(product3);
        order5.addProduct(product5);

        //Adding orders to the system
        storeView.addOrder(order1);
        storeView.addOrder(order2);
        storeView.addOrder(order3);
        storeView.addOrder(order4);
        storeView.addOrder(order5);

        //Initializing Customers with some information and simulating that they have orders
        Customer customer1 = new Customer("Mehmet", 29);
        customer1.addOrder(order1);
        Customer customer2 = new Customer("Cem",28);
        Customer customer3 = new Customer("Cem",22);
        Customer customer4 = new Customer("Abraham",23);
        Customer customer5 = new Customer("John",23);
        Customer customer6 = new Customer("Camille",25);
        Customer customer7 = new Customer("Viktor",18);
        Customer customer8 = new Customer("Heimerdinger",19);
        Customer customer9 = new Customer("Cem",27);
        customer9.addOrder(order1);
        Customer customer10 = new Customer("Cem",28);
        customer10.addOrder(order1);

        //Adding customers to the system
        storeView.addCustomer(customer1);
        storeView.addCustomer(customer2);
        storeView.addCustomer(customer3);
        storeView.addCustomer(customer4);
        storeView.addCustomer(customer5);
        storeView.addCustomer(customer6);
        storeView.addCustomer(customer7);
        storeView.addCustomer(customer8);
        storeView.addCustomer(customer9);
        storeView.addCustomer(customer10);

        //Get total customer size
        storeView.getCustomerSize();

        System.out.println();
        //Total number of products that customers whose names are 'Cem' bought
        storeView.getProductNumberCemsBought();

        System.out.println();
        //Total amount of invoices of customers whose names are 'Cem' and their ages are between 25 and 30.
        storeView.getTotalInvoiceCems();

        System.out.println();
        //Invoices that are greater than 1500 TL
        storeView.getInvoicesGreaterThan1500();
    }
}
