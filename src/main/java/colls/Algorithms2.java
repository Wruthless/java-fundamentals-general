package colls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms2 {

    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("orange");
        list2.add("indigo");
        list2.add("cyan");

        System.out.printf("%nBefore addAll, list2 contains: ");

        for (String s: list2) {
            System.out.printf("%s   ", s);
        }

        Collections.addAll(list2, colors);

        System.out.printf("%n%nAfter addAll, list2 contains: ");

        for (String s: list2) {
            System.out.printf("%s   ", s);
        }

        // frequency of red
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%n • Frequency of red in list2: %d%n", frequency);


        // check if list1 and list2 have elements in common
        boolean disjoint = Collections.disjoint(list1, list2);

        System.out.printf("%nlist1 and list 2 %s elements in common%n", disjoint ? "do not have" : "have");
    }
}
