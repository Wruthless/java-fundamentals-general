package genericClassesMethods;

public class GenericMethodTest {

    public static void main(String[] args) {

        // Arrays of Integer, Double, and Character
        Integer[] integers = { 1, 2, 3, 4, 5, 6 };
        Double[] doubles = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
        Character[] characters = { 'H', 'E', 'L', 'L', 'O' };

        printArray(integers);
        System.out.println();
        printArray(doubles);
        System.out.println();
        printArray(characters);

    } // end main()

    // Generic method
    public static <T> void printArray(T[] inputArray) {

        for ( T element : inputArray ) {
            System.out.printf("%s ", element);
        }
        System.out.println();

    } // end printArray()

} // end GenericMethodTest
