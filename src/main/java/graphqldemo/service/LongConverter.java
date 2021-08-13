package graphqldemo.service;

public class LongConverter {

    public static Long stringToLong(String input) {
        try {
            return Long.parseLong(input);
        } catch (final NumberFormatException e) {
            e.printStackTrace();
            return -1L;
        }
    }
}
