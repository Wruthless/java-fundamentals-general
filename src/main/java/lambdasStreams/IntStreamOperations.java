package lambdasStreams;

import java.util.stream.IntStream;

public class IntStreamOperations {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // Display original values
        System.out.println("Original values: ");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));

        // Count
        System.out.printf("%n%nCount: %d%n", IntStream.of(values).count());

        // Min
        System.out.printf("%nMin: %d%n", IntStream.of(values).min().getAsInt());

        // Max
        System.out.printf("%nMax: %d%n", IntStream.of(values).max().getAsInt());

        // Summation
        System.out.printf("%nSum: %d%n", IntStream.of(values).sum());

    }
}
