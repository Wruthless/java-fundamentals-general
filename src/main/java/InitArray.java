public class InitArray {

    public static void main(String[] args) {

        // int[rows][columns]
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};

        // three rows
        int[][] array2 = {{1, 2}, {3}, {4, 5, 6}};

        // four rows
        int[][] array3 = {{1, 2}, {3}, {4}, {5, 6}};


        System.out.printf("array1:%n");
        outputArray(array1);

        System.out.println();

        System.out.printf("array2:%n");
        outputArray(array2);

        System.out.println();

        System.out.printf("array3:%n");
        outputArray(array3);
    }

    public static void outputArray(int[][] array) {

        // loops twice as array 1 has two rows
        // loops three times as array 2  has three rows
        for (int i = 0; i < array.length; i++) {

            // walk through the columns within each row, each row has its own length
            // array1 = 3 3
            // array2 = 2 1 3
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d   ", array[i][j]);
            }
            System.out.println(); // break after each row
        }
    }
}
