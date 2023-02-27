package polyInterface;

public class PayableInterfaceTest {

    public static void main(String[] args) {

        // 4 element array to hold objects
        Payable[] payableObject = new Payable[4];

        // array of objects implementing Payable
        payableObject[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObject[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObject[2] = new SalariedEmployee("Jon", "Smiff", "111-11-1111", 800.00);
        payableObject[3] = new SalariedEmployee("Lisa", "Barnes", "222-22-2222", 1200.00);


        System.out.printf("Invoices and Employees processed polymorphically: ");

        for (Payable currentPayable : payableObject) {
            System.out.printf("%s%n%s%f", currentPayable.toString(), "payment due: ", currentPayable.getPaymentAmount());
        }
    }

} // end PayableInterfaceTest class
