import java.util.Arrays;

public class ArrayManipulations {

    public static void main(String[] args) {

        System.out.printf("%nSorted:%n");

        double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
        Arrays.sort(doubleArray);

        for (double value : doubleArray) {
            System.out.printf("%.1f     ", value);
        }

        System.out.printf("%n%nAll 7s:%n");

        // fill 10 element array with 7s
        int[] fillWithSevens = new int[10];
        Arrays.fill(fillWithSevens, 7);
        for(int value: fillWithSevens) {
            System.out.printf("%d   ", value);
        }

        System.out.printf("%n%nCopy Array:%n");

        // copy array intArray into array intArrayCopy
        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);

        System.out.printf("IntArray     >>> ");
        for (int value: intArray) {
            System.out.printf("%d   ", value);
        }

        System.out.printf("%n");

        System.out.printf("intArrayCopy >>> ");
        displayArray(intArray);

        System.out.printf("%n");

        System.out.printf("%nProgrammatically check equality between intArray and intArrayCopy:%n");

        // Compare intArray and intArrayCopy for equality
        var b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("intArray %s intArrayCopy%n", (b ? "==" : "!-"));

        // Search for a value and return the index if it exists
        System.out.printf("%nLook for the value 5 in intArray (binary search):");
        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("%n[+] Value exists at index: %d", location);
        } else {
            System.out.printf("%n[-] Value does not exist!");
        }

        System.out.printf("%n");

        // Example with a value that does not exist
        System.out.printf("%nLook for the value 8763 in intArray (binary search):");
        int nullLoc = Arrays.binarySearch(intArray, 8763);

        if (nullLoc >= 0) {
            System.out.printf("%n[+] Value exists at index: %d", nullLoc);
        } else {
            System.out.printf("%n[-] Value does not exist!");
        }
    }

    public static void displayArray(int[] array) {

        for(var value: array) {
            System.out.printf("%d   ", value);
        }
    }
}
