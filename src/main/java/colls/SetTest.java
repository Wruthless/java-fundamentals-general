package colls;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        String[] colors = {"red", "gray", "white", "orange", "blue", "black", "yellow", "gray", "purple", "orange", "tan", "pink"};
        List<String> list = Arrays.asList(colors);

        System.out.printf("List: %s%n", list);
        printNonDuplicates(list);
    }

    private static void printNonDuplicates(Collection<String> values) {

        // Create HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNon-duplicates are: ");

        for (String value: set) {
            System.out.printf("%s   ", value);
        }

        System.out.println();
    }
}
