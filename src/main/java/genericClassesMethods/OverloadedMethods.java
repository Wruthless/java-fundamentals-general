package genericClassesMethods;

public class OverloadedMethods {

    public static void main(String[] args) {

        // Arrays of Integer, Double, and Character
        Integer[] integers = { 1, 2, 3, 4, 5, 6 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        Character[] characters = {'H', 'E', 'L', 'L', 'O'};

        printArray(integers);
        System.out.println();
        printArray(doubles);
        System.out.println();
        printArray(characters);

    } // end main()

    // Integers
    public static void printArray(Integer[] inputArray) {

        for ( Integer element : inputArray ) {
            System.out.printf("%s ", element);
        }
        System.out.println();

    } // end printArray()

    // Doubles
    public static void printArray(Double[] inputArray) {

        for ( Double element : inputArray ) {
            System.out.printf("%.1f ", element);
        }
        System.out.println();

    } // end printArray()

    // Characters
    public static void printArray(Character[] inputArray) {

        for ( Character element : inputArray ) {
            System.out.printf("%c ", element);
        }
        System.out.println();

    } // end printArray()

} // end OverloadedMethods
