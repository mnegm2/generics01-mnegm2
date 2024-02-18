package mnegm2;

/**
 * Main class to demonstrate the usage of GenericUtils methods.
 */
public class Main {
    /**
     * Main method to demonstrate the usage of GenericUtils methods.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String[] sentence = {"A", "B", "C"};
        System.out.println("first: " + sentence[0] + "; last: " + sentence[2]);
        GenericUtils.reverse(sentence);
        System.out.println("after reverse - first: " + sentence[0] + "; last: " + sentence[2]);

        Double[] numbers = {1.3, 2.3, 3.3};
        System.out.println("\nfirst: " + numbers[0] + "; last: " + numbers[2]);
        GenericUtils.reverse(numbers);
        System.out.println("after reverse - first: " + numbers[0] + "; last: " + numbers[2]);

        System.out.println("sum (ca. 6.9) - " + GenericUtils.sum(numbers));
        //GenericUtils.sum(sentence);     --- does not work!
    }
}
