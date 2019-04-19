<<<<<<< HEAD
import java.util.stream.IntStream;

public class StringCalculator {
    public static int splitAndSum(String value) {
        if (isaBoolean(value)) {
            return 0;
        }
        return sum(toInts(value.split(",|:"))).getNumber();
    }

    private static boolean isaBoolean(String value) {
        return value == null || value.isEmpty();
    }

    private static Positive sum(Positive[] values) {
        Positive result = new Positive(0);
        for(Positive val : values) {
            result = result.add(val);
        }
        return result;
    }

    private static Positive[] toInts(String[] values) {
        Positive[] positive = new Positive[values.length];
        for (int i =0; i < positive.length; i++ ) {
            positive[i] = new Positive(values[i]);
        }
        return positive;
=======
public class StringCalculator {
    public static int splitAndSum(String text) {
        if (isBlank(text)) {
            return 0;
        }
        return sum(toInts(split(text)));
    }

    private static String[] split(String text) {
        return text.split(",|:");
    }

    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private static int sum(Positive[] numbers) {
        Positive result = new Positive(0);
        for (Positive number : numbers) {
            result = result.add(number);
        }
        return result.getNumber();
    }

    private static Positive[] toInts(String[] values) {
        Positive[] numbers = new Positive[values.length];
        for (int i = 0; i < values.length; i++) {
            numbers[i] = new Positive(values[i]);
        }
        return numbers;
>>>>>>> a172b9b21db784dd16cbeedba82abf11691a134f
    }
}
