package e2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Resemblance {

    public int resemblance(String sequence1, String sequence2) {
        return IntStream
                .range(1, Math.min(sequence1.length(), sequence2.length()) + 1)
                .map(i -> compareToInt(sequence1.substring(0, i), sequence2.substring(0, i)))
                .sum();
    }

    private int compareToInt(String substring1, String substring2) {
        return substring1.equals(substring2) ? 1 : 0;
    }



}
