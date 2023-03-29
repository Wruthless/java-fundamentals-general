package lambdasStreams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysAndStreams {

    public static void main(String[] args) {
        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        System.out.printf("Original values: %s%n", Arrays.asList(values));

        // Sort values in asc order w/streams
        // Implicitly display as string.
        System.out.printf("Sorted values: %s%n",
            // Data source
            Arrays.stream(values)
                .sorted()
                // Terminal operation, performs a mutable reduction.
                .collect(Collectors.toList()));

        // Values > four
        List<Integer> greaterThan4 =
            Arrays.stream(values)
                .filter(value -> value > 4)
                .sorted()
                .collect(Collectors.toList());
        System.out.printf("Values greater than 4: %s%n", greaterThan4);

    }
}
