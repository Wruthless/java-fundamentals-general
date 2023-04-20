package genericClassesMethods;

import java.util.EmptyStackException;

public class StackTest {

    public static void main(String[] args) {

        Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Stack<Double> and Stack<Integer>
        Stack<Double> doubleStack = new Stack<>(5);
        Stack<Integer> integerStack = new Stack<>();

        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack);

        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);


    } // end main()



    public static <T> void testPush(String name, Stack<T> stack, T[] elements) {

        System.out.printf("%nPushing elements onto %s%n", name);


        for ( T element : elements ) {
            System.out.printf("%s ", element);
            stack.push(element);
        }

    } // end testPush()


    private static <T> void testPop(String name, Stack<T> stack) {

        try {
            System.out.printf("%nPopping elements from %s%n", name);
            T popValue;

            while ( true ) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch ( EmptyStackException emptyStackException) {
            System.out.println();
            emptyStackException.printStackTrace();
        }
    } // end testPop()


} // end StackTest {}
