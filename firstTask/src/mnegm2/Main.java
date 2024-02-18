package mnegm2;

public class Main {
    /**
     * A test method to demonstrate the functionality of MyStack.
     * @param args Command-line arguments.
     * @throws StackFullException if the stack is full.
     * @throws StackEmptyException if the stack is empty.
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
