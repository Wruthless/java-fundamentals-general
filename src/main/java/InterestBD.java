import java.math.BigDecimal;
import java.text.NumberFormat;

public class InterestBD {

    public static void main(String[] args) {

        // valueOf takes a double value and turns it into a BigDecimal object.
        BigDecimal principal = BigDecimal.valueOf(1000.0);
        BigDecimal rate = BigDecimal.valueOf(0.05);

        // for display
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for (int i = 0; i <= 10; i++) {
            // BigDecimal.ONE => 1.
            // rate.add(BigDecimal.ONE) => (1.0 + rate).
            // pow(i) called on BigDecimal object.
            BigDecimal amount = principal.multiply(rate.add(BigDecimal.ONE).pow(i));

            // Display output using NumberFormat to get currency formatting.
            // getCurrencyInstance() is locale specific (US => $).
            System.out.printf("%4d%20s%n", i, NumberFormat.getCurrencyInstance().format(amount));
        }

    } // end main.

} // end InterestDB.
