package genericClassesMethods;

import java.util.ArrayList;

public class TotalNumbers {


    public static void main(String[] args) {


        Number[] numbers = { 1, 2.4, 3, 4.1 };
        ArrayList<Number> numberList = new ArrayList<>();

        for ( Number element : numbers ) {
            numberList.add(element);
        }

        System.out.printf("%nnumberList: %s%n", numberList);
        System.out.printf("Total of elements:  %.1f%n", sum(numberList));
    }

    public static double sum(ArrayList<Number> list) {

        double total = 0;

        for ( Number element : list ) {
            total += element.doubleValue();
        }

        return total;
    }

}
