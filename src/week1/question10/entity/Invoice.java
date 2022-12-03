package week1.question10.entity;

public class Invoice {
    private static int counter = 0; //Default to 0
    private int invoiceId;
    private double invoiceAmount;
    private Order order;

    public Invoice() {
        setInvoiceId(counter);
        counter++;
    }

    public Invoice(Order order) {
        setInvoiceId(counter);
        counter++;
        this.order = order;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public void setInvoiceAmount() {
        double amount = 0;

        for (int i = 0; i < order.getProducts().size(); i++) {
            amount += order.getProducts().get(i).getPrice();
        }
        invoiceAmount = amount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    @Override
    public String toString() {
        return "InvoiceId:" + invoiceId + " InvoiceAmount: " + invoiceAmount;
    }
}
