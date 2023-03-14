package colls;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort1 {

    public static void main(String[] args) {

        String[] suites = {"Hearts", "Diamonds", "Clubs", "Spades"};

        // Create and display a list containing the suits array elements
        List<String> list = Arrays.asList(suites);

        // Sort alphabetically
        // Reorder the list in memory
        Collections.sort(list);
        System.out.printf("%s%n", list);

    }
}
