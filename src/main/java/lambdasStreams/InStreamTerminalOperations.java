package lambdasStreams;

import java.util.function.DoubleFunction;
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

        /**
         * Terminal Operation reduce().
         */

        // sum() equivalent with reduce.
        System.out.printf("%nSum via reduce: %d%n",
            IntStream.of(values).reduce(0, (x, y) -> x + y));

        // sum of squares of values with reduce.
        System.out.printf("%nSum of squares via reduce: %d%n",
            IntStream.of(values).reduce(0, (x, y) -> x + y * y));

        // produce of values with reduce
        System.out.printf("%nProduct of values via reduce: %d%n",
            IntStream.of(values).reduce(1, (x, y) -> x * y));

        // even values displayed in sorted order
        System.out.printf("%nSorted even values: ");
        IntStream.of(values)
            .filter(value -> value % 2 == 0)
            .sorted()
            .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // even values displayed in sorted order
        System.out.printf("%nSorted odd values multiplied by 10: ");
        IntStream.of(values)
            .filter(value -> value % 2 !=  0)
            .map(value -> value * 10)
            .sorted()
            .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // sum range from 1 to 10 exclusive
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
        IntStream.range(1,10).sum());

        // sum range of integers from 1 to 10 inclusive
        System.out.printf("%nSum of integers from 1 to 10: %d%n",
        IntStream.rangeClosed(1,10).sum());

    }
}
