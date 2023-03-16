package colls;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms1 {

    public static void main(String[] args) {

        // create display a character list
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        System.out.println("list contains: ");
        output(list);

        // reverse it
        Collections.reverse(list);
        System.out.printf("%nAfter reversal: %n");
        output(list);

        // create copyList from 3 character array
        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying: %n");
        output(copyList);

        // fill list with 1s
        Collections.fill(list, '1');
        System.out.printf("%nAfter calling fill: %n");
        output(list);
    }

    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        // iterate through the characters
        for (Character element: listRef) {
            System.out.printf("%c   ", element);
        }

        // String and Characters are comparable by default
        System.out.printf("%nMax: ");
        System.out.println(Collections.max(listRef));
        System.out.printf("Min: %c%n", Collections.min(listRef));
    }

}
