package genericClassesMethods;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {


    // Stores elements on the stack.
    private final ArrayList<T> elements;


    // Creates a stack with a default size.
    // Uses single arg constructor (this).
    public Stack() {
        this(10); // References single arg constructor.
    } // end Stack()


    // Allows overriding of default stack size.
    public Stack(int capacity) {

        int initCapacity = capacity > 0 ? capacity : 10;
        elements = new ArrayList<T>(initCapacity);

    } // end Stack(int capacity);


    public void push(T pushValue) {
        elements.add(pushValue);
    } // end push()


    public T pop() {

        if(elements.isEmpty()) {
            throw new EmptyStackException("Stack is empty, cannot pop.");
        }

        // Remove and return top element of stack.
        // Stack is LIFO -- the last item placed into the stack
        // will be the first item removed.
        return elements.remove(elements.size() - 1);

    } // end pop()


} // end Stack<>{}
