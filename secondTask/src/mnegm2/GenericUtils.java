package mnegm2;

/**
 * Utility class for performing generic operations.
 */
public class GenericUtils {
    /**
     * Reverses the elements in the given array.
     *
     * @param items The array whose elements are to be reversed.
     * @param <T>   The type of elements in the array.
     */
    public static<T> void reverse(T[] items) {
        for (int i = 0; i < items.length/2; i++) {
            T temp =  items[i];
            items[i] = items[items.length-1-i];
            items[items.length-1-i] = temp;
        }
    }

    /**
     * Calculates the sum of elements in the given array.
     *
     * @param items The array whose elements are to be summed.
     * @param <T>   The type of elements in the array, which must extend Number.
     * @return The sum of elements in the array.
     */
    public static<T extends Number> double sum(T[] items) {
        double sum = 0;
        for (int i = 0; i< items.length; i++) {
            if(items[i] != null) {
                sum+=(double)items[i];
            }
        }
        return sum;
    }
}