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
}
