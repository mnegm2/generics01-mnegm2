package mnegm2;

public class GenericUtils {
    public static<T> void reverse(T[] items) {
        for (int i = 0; i < items.length/2; i++) {
            T temp =  items[i];
            items[i] = items[items.length-1-i];
            items[items.length-1-i] = temp;
        }
    }


}