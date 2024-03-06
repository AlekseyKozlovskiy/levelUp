package lvlUp6.first;

import java.util.Arrays;

public class ArrayUtil {
    public int min(int[] array) {
        return Arrays.stream(array).min().getAsInt();
    }

    public int max(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }

}
