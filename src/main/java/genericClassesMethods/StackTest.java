package genericClassesMethods;

public class StackTest {

    public static void main(String[] args) {

        double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Stack<Double> and Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>(elements);

        // Push elements of doubleElements onto doubleStack
        testPushDouble(doubleStack, doubleElements);
        testPopDouble(doubleStack);

        // Push elements of integerElements onto integerStack
        testPushInteger(integerStack, integerElements);
        testPopInteger(integerStack);

    } // end main()


    private static void testPushDouble(Stack<Double> stack, double[] values) {

        System.out.printf("%n[+] Pushing onto doubleStack%n");

        for ( double value : values ) {
            System.out.printf("%.1f ", value);
            stack.push(value);
        }

    } // end testPushDouble()


    private static void testPopDouble(Stack<Double> stack) {

        try {
            System.out.printf("%n[+] Popping elements from doubleStack%n");

            // Store the popped element.
            double popValue;

            // Remove all elements from stack.
            while(true) {
                popValue = stack.pop();
                System.out.printf("%.1f ", popValue);
            }
        } catch ( EmptyStackException emptyStackException ) {
            System.err.println();
            emptyStackException.printStackTrace();
        }

    } // end testPopDouble()


    private static void testPushInteger(Stack<Integer> stack, int[] values) {

        System.out.printf("%n[+] Pushing onto integerStack%n");

        for ( int value : values ) {
            System.out.printf("%d ", value);
            stack.push(value);
        }

    } // end testPushInteger()


    private static void testPopInteger(Stack<Integer> stack) {

        try {
            System.out.printf("%n[+] Popping elements from integerStack%n");

            // Store the popped element.
            int popValue;

            // Remove all elements from stack.
            while(true) {
                popValue = stack.pop();
                System.out.printf("%d ", popValue);
            }
        } catch ( EmptyStackException emptyStackException ) {
            System.err.println();
            emptyStackException.printStackTrace();
        }

    } // end testPopInteger()


} // end StackTest {}
