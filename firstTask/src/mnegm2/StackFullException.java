package mnegm2;

public class StackFullException extends Exception{
    public StackFullException() {
        super("Stack is full!");
    }

    public StackFullException(String message) {
        super(message);
    }
}
