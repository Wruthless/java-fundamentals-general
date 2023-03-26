package lambdasStreams;

import java.util.stream.IntStream;

public class InStreamTerminalOperations {

    public static void main(String[] args) {
        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.println("Original values:");
        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        /**
         * IntStream terminal operations used for Stream Reductions.
         * Stream Reductions take all elements in a stream, and reduces
         * the elements to a single value.
         */

        // count
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        // min
        // Returns an OptionalInt. This is done as there could be no min in
        // the stream. The OptionalInt contains the reduction if one exists.
        // To return the reduction, getAsInt() is chained after min().
        System.out.printf("%nMin: %d%n", IntStream.of(values).min().getAsInt());

        // max
        System.out.printf("%nMax: %d%n", IntStream.of(values).max().getAsInt());

        // sum
        System.out.printf("%nSum: %d%n", IntStream.of(values).sum());

        // average
        System.out.printf("%nAvg: %.2f%n", IntStream.of(values).average().getAsDouble());
    }
}
