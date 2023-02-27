package polyInterface;


public class Invoice implements Payable {

    private final String partDescription;
    private final String partNumber;
    private int quantity;
    private double pricePerItem;

    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partDescription = partDescription;
        this.partNumber = partNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public String toString() {
        return "Invoice{" +
            "partDescription='" + partDescription + '\'' +
            ", partNumber='" + partNumber + '\'' +
            ", quantity=" + quantity +
            ", pricePerItem=" + pricePerItem +
            '}';
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() + getPricePerItem();
    }
}
