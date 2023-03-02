package colls;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String color: colors) {
            list1.add(color);
        }

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

    }
}
