import java.util.ArrayList;
import java.util.List;

public class Excep {
    private static List<Integer> integers = new ArrayList<>();

    public static void addInteger(Integer value) throws IllegalArgumentException {
        if (integers.contains(value)) {
            throw new IllegalArgumentException("Integer already added.");
        }
        integers.add(value);
    }

    public static void main(String[] args) {
        try {
            addInteger(7);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }
    }
}
