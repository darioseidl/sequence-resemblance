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

//    public int resemblance(String sequence1, String sequence2) {
//
//        int minLength = Math.min(sequence1.length(), sequence2.length());
//
//        int sum = IntStream.range(1, minLength + 1).map(i -> {
//            String substring1 = sequence1.substring(0, i);
//            String substring2 = sequence2.substring(0, i);
//
//            if (substring1.equals(substring2)) {
//                System.out.println("same: " + substring1 + "=" + substring1);
//                return 1;
//            } else {
//                System.out.println("difference: " + substring1 + "!=" + substring2);
//                return 0;
//            }
//        }).sum();
//
//        return sum;
//    }

}
