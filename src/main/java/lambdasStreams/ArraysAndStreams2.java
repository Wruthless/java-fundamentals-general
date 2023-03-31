package lambdasStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {

    public static void main(String[] args) {
        String[] colors = {"red", "white", "Orange", "Blue", "black", "yellow", "Purple", "tan", "pink", "violet", "indigo"};

        System.out.printf("%nOriginal strings: %s%n", Arrays.asList(colors));

        // colors in uppercase
        System.out.printf("%ncolors in uppercase: %s%n",
            Arrays.stream(colors)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        // strings greater than m in asc order
        System.out.printf("%ncolors greater than m sorted asc: %s%n",
            Arrays.stream(colors)
                .filter(c -> c.compareToIgnoreCase("m") >0 )
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));

        // strings greater than "m" sorted in desck order
        System.out.printf("%ncolors greater than m sroted desc: %s%n",
            Arrays.stream(colors)
                .filter(c -> c.compareToIgnoreCase("m") > 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList()));
    }
}
