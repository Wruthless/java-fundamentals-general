package colls;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {

    public static void main(String[] args) {

        String[] colors = {"red", "white", "orange", "blue", "black", "yellow", "purple", "tan", "pink"};

        // TreeSet is an implementation of SortedSet, list of colors as Strings
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.printf("%n%s", "sorted set: ");
        printSet(tree);

        // get headSet based on "orange"
        System.out.printf("%n%s", "headSet (\"orange\"):  ");
        printSet(tree.headSet("orange"));

        // get tailSet based upon "orange"
        System.out.printf("%s", "tailSet (\"orange\")   ");
        printSet(tree.tailSet("orange"));

        // get first and last elements
        System.out.printf("%nFirst: %s%n", tree.first());
        System.out.printf("Last: %s%n", tree.last());
    }

    private static void printSet(SortedSet<String> set) {
        for (String s: set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }
}
