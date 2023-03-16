package colls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "black");
        printSearchResults(list, "red");
    }

    private static void printSearchResults(List<String> list, String black) {
    }
}
