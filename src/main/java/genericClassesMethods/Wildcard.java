package genericClassesMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class Wildcard {

    public static void main(String[] args) {

        Integer[] integers = { 1, 2, 3, 4, 5 };

        ArrayList<Integer> integerList = new ArrayList<>(Arrays.asList(integers));

        System.out.printf("%nThe list contains: %s%n", integerList);
        System.out.printf("Total elements in list: %.0f%n%n", sum(integerList));


        Double[] doubles = { 1.1, 3.3, 5.5 };
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(doubles));

        System.out.printf("%nThe list contains: %s%n", doubleList);
        System.out.printf("Total elements in list: %.0f%n%n", sum(doubleList));

    }


    public static double sum(ArrayList<? extends Number> list) {

        double total = 0;

        for ( Number element : list ) {
            total += element.doubleValue();
        }

        return total;
    }


}
