package mnegm2;

public class StackEmptyException extends Exception{
    public StackEmptyException() {
        super("Stack is empty!");
    }
    
    public StackEmptyException(String message) {
        super(message);
    }
}
