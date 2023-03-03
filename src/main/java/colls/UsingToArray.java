package colls;

import java.util.Arrays;
import java.util.LinkedList;

public class UsingToArray {

    public static void main(String[] args) {

        String[] colors = {"black", "blue", "yellow"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("red");              // last
        links.add("pink");                   // add to end
        links.add(3, "green");  // add at 3rd index
        links.addFirst("cyan");           // first item

        // get LinkedList elements as array
        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");
    }
}

