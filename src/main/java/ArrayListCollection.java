import java.sql.Array;
import java.util.ArrayList;

public class ArrayListCollection {

    public static void main(String[] args) {

        // create a new ArrayList of String with an initial capacity of 10.
        ArrayList<String> items = new ArrayList<String>();

        System.out.println();

        items.add("red"); // add element.
        items.add(0, "yellow"); // add element at a particular index.

        // notice size() is used for ArrayList not length()
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s   ", items.get(i)); // get returns the items in the ArrayList
        }

        System.out.printf("%n%n");

        display(items); // enhanced for loop.

        items.add("green");
        items.add("yellow");

        display(items);

        items.remove("yellow"); // removes first yellow in list
        display(items);

        items.remove(1); // remove index 1 (green)
        display(items);

        // check if a value is in the list
        System.out.printf("\"red\" is %s in the list %n", items.contains("red") ? "" : "not ");

        System.out.println();

        // display number of remaining items in the list
        System.out.printf("Size: %s%n", items.size());
    }

    public static void display(ArrayList<String> string) {
        for (String items : string) {
            System.out.printf("%s   ", items);
        }

        System.out.printf("%n%n");
    }
}
