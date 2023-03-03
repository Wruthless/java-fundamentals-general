package colls;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {

    public static void main(String[] args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color: colors) {
            list1.add(color);
        }

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for(String color: colors2) {
            list2.add(color);
        }

        list1.addAll(list2);    // concat lists
        list2 = null;           // release memory
        printList(list1);

        convertToUppercaseString(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);

    }

    private static void printReversedList(List<String> list1) {

        // define iterator
        ListIterator<String> iterator = list1.listIterator(list1.size());   // total number of elements --all

        System.out.printf("%nReversed List: %n");

        // use iterator methods to walk list in reverse
        // instead of hasNext use hasPrevious.
        while(iterator.hasPrevious()) {
            System.out.printf("%s   ", iterator.previous()); // previous() instead of next()
        }
    }

    private static void removeItems(List<String> list1, int start, int end) {
        // sublist gives view into list object, starting at start
        // ending at end, non-inclusive.
        list1.subList(start, end).clear();
    }


    private static void convertToUppercaseString(List<String> list) {

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void printList(List<String> list) {

        System.out.printf("%nlist:%n");

        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            String color = iterator.next();
            System.out.printf("%s   ", color);
        }

        System.out.println();
    }

}
