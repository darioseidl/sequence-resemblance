package e2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Resemblance {

    public static void main(String[] args) {
        int resemblance = resemblance("aabxcdefx", "aabcdxxxxxxxxxxxxx");
        System.out.println(resemblance);
    }

    public static int resemblance(String sequence1, String sequence2) {
        return IntStream
                .range(1, Math.min(sequence1.length(), sequence2.length()))
                .map(i -> compare(sequence1.substring(0, i), sequence2.substring(0, i)))
                .sum();
    }

    private static int compare(String substring1, String substring2) {
        return substring1.equals(substring2) ? 1 : 0;
    }
}
