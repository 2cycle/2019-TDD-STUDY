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
    }
}
