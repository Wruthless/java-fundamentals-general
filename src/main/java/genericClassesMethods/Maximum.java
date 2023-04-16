package genericClassesMethods;

import java.util.Comparator;

public class Maximum {


    public static void main(String[] args) {

        System.out.printf("Max of %d, %d and %d: %d%n%n", 3, 4, 5, maximum(3, 4, 5));

        System.out.printf("Max of %.1f, %.1f and %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.8));

        System.out.printf("Max of %s, %s and %s%n%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));

    } // end main ()


    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {

        // Assume x is initially the largest value.
        T max = x;

        if( y.compareTo(max) > 0 ) {
            max = y;
        }

        return max;

    }

} // end Maximum {}
