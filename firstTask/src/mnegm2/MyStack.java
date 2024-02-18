package mnegm2;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<T extends Number>  {
    private T[] stack;

    public MyStack(int length) {
        this.stack = (T[]) new Object[length];
    }
    public MyStack() {
        this(1);
    }

    public void push(T item) {
        T[] newStack = Arrays.copyOf(stack, stack.length+1);
        newStack[stack.length] = item;
        stack=newStack;
    }
    public T pop() {
        T item = peek();
        T[] newStack = Arrays.copyOf(stack, stack.length-1);
        stack=newStack;
        return item;
    }
    public T peek() {
        T item = stack[stack.length-1];
        return item;
    }

}
