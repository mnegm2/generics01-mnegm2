package mnegm2;

import jdk.jshell.Snippet;

import java.awt.*;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * A generic stack implementation that stores elements of type T extending Number.
 */
public class MyStack<T> {
    /** The underlying array to store stack elements. */
    private T[] stack;

    /**
     * Constructs a new MyStack instance with the specified initial length.
     * @param length The initial length of the stack.
     */
    public MyStack(int length) {
        this.stack = (T[]) new Object[length];
    }

    /**
     * Constructs a new MyStack instance with default initial length of 1.
     */
    public MyStack() {
        this(1);
    }

    /**
     * Pushes an element onto the top of this stack.
     * @param item The item to be pushed onto this stack.
     */
    public void push(T item) {
        if (stack[stack.length-1] != null) {
            T[] newStack = Arrays.copyOf(stack, stack.length+1);
            newStack[stack.length] = item;
            stack=newStack;
        } else {
            stack[stack.length-1] = item;
        }
    }

    /**
     * Removes the element at the top of this stack and returns it.
     * @return The element at the top of this stack.
     * @throws EmptyStackException if the stack is empty.
     */
    public T pop() {
        try {
            T item = peek();
            T[] newStack = Arrays.copyOf(stack, stack.length-1);
            stack=newStack;
            return item;
        } catch (Exception e) {
            throw new EmptyStackException();
        }
    }

    /**
     * Returns the element at the top of this stack without removing it.
     * @return The element at the top of this stack.
     */
    public T peek() {
        return (T) stack[stack.length - 1];
    }

    /**
     * Returns a string representation of the elements in the stack.
     * @return A string representation of the elements in the stack.
     */
    public String list() {
        StringBuilder text = new StringBuilder();
        for (int i = stack.length; i > 0; i--) {
            text.append(stack[i - 1]).append(";");
        }
        return text.toString();
    }

    /**
     * A test method to demonstrate the functionality of MyStack.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        var numberStack = new MyStack<String>();
        System.out.println("//peek\n" + numberStack.peek() + " == null");
        numberStack.push("1");
        numberStack.push("2");
        numberStack.push("3");
        System.out.println(numberStack.list());
        System.out.println("//peek\n" + numberStack.peek() + " == 3");
        numberStack.pop();
        System.out.println("//pop + peek\n" + numberStack.peek() + " == 2");
        numberStack.pop();
        System.out.println("//pop + peek\n" + numberStack.peek() + " == 1");
    }

    /*public class MyStack<T extends Number>  {
    private T[] stack;

    public MyStack(int length) {
        this.stack = (T[]) new Object[length];
    }
    public MyStack() {
        this(1);
    }

    public void push(T item) {
        if (stack[stack.length-1] != null) {
            T[] newStack = Arrays.copyOf(stack, stack.length+1);
            newStack[stack.length] = item;
            stack=newStack;
        } else {
            stack[stack.length-1] = item;
        }
    }
    public T pop() {
        try {
            T item = peek();
            T[] newStack = Arrays.copyOf(stack, stack.length-1);
            stack=newStack;
            return item;
        } catch (Exception e) {
            throw new EmptyStackException();
        }
    }
    public T peek() {
        T item = stack[stack.length-1];
        return item;
    }

    public String list() {
        String text = "";
        for (int i = stack.length; i > 0;i--) {
            text = new StringBuilder().append(stack[i-1]).append(";").toString();
        }
        return text;
    }

    public static void main(String[] args) {
        MyStack<Integer> numberStack = new MyStack<Integer>();
        //System.out.println(numberStack.peek() + " == null");
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        System.out.println(numberStack.peek() + " == 3");
        numberStack.pop();
        System.out.println(numberStack.peek() + " == 2");
    }
}
*/
}