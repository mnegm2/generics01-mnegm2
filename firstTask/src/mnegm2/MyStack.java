package mnegm2;
import java.util.Arrays;

/**
 * A generic stack implementation that stores elements of type T extending Number.
 */
public class MyStack<T> {
    /** The underlying array to store stack elements. */
    private T[] stack;
    private int index;

    /**
     * Constructs a new MyStack instance with the specified initial length.
     * @param length The initial length of the stack.
     */
    public MyStack(int length) {
        this.stack = (T[]) new Object[length];
        index = 0;
    }

    /**
     * Constructs a new MyStack instance with default initial length of 1.
     */
    public MyStack() {
        this(3);
    }

    /**
     * Pushes an element onto the top of this stack.
     * @param item The item to be pushed onto this stack.
     */
    public void push(T item) throws StackFullException {
        /*if (stack[stack.length - 1] != null) {
            T[] newStack = Arrays.copyOf(stack, stack.length + 1);
            newStack[stack.length] = item;
            stack = newStack;
        } else {
            stack[stack.length - 1] = item;
        }*/
        if(stack[stack.length - 1] != null) {
            throw new StackFullException();
        } else {
            stack[index++] = item;
            //index++;
        }
    }

    /**
     * Removes the element at the top of this stack and returns it.
     * @return The element at the top of this stack.
     */
    public T pop() throws StackEmptyException {
        /*T item = peek();
        T[] newStack = Arrays.copyOf(stack, stack.length - 1);
        stack = newStack;
        return item;*/
        T item;
        if(peek() == null) {
            throw new StackEmptyException();
        } else {
            item = peek();
            index--;
            stack[index] = null;
        }
        return item;
    }

    /**
     * Returns the element at the top of this stack without removing it.
     * @return The element at the top of this stack.
     */
    public T peek() throws StackEmptyException{
        if(index > 0)
            return (T) stack[index-1];
        else
            return (T) stack[index];
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
    public static void main(String[] args) throws StackFullException, StackEmptyException {
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
}