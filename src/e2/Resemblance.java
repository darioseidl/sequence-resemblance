package e2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Resemblance {

    public static void main(String[] args) {
        System.out.println(resemblance("aabxcdefx", "aabcdxxxxxxxxxxxxx"));
        System.out.println(resemblance("ababaa", "ababaa"));
    }

//    public static int resemblance(String sequence1, String sequence2) {
//        return IntStream
//                .range(1, Math.min(sequence1.length(), sequence2.length()))
//                .map(i -> compareToInt(sequence1.substring(0, i), sequence2.substring(0, i)))
//                .sum();
//    }

    public static int resemblance(String sequence1, String sequence2) {

        int minLength = Math.min(sequence1.length(), sequence2.length());

//        int resemblance = 0;

//        for (int i = 0; i < minLength; i++) {
//            char char1 = sequence1.charAt(i);
//            char char2 = sequence2.charAt(i);
//
//            if (char1 == char2) {
//                System.out.println("same: " +  char1 + "=" + char1);
//                resemblance = resemblance + 1;
//            }
//            else {
//                System.out.println("difference: " + char1 + "!=" + char2);
//                break;
//            }
//        }

        int sum = IntStream.range(0, minLength).map(i -> {
            String substring1 = sequence1.substring(0, i);
            String substring2 = sequence2.substring(0, i);

            if (substring1.equals(substring2)) {
                System.out.println("same: " + substring1 + "=" + substring1);
                return 1;
            } else {
                System.out.println("difference: " + substring1 + "!=" + substring2);
                return 0;
            }
        }).sum();

        return sum;
    }


    private static int compareToInt(String substring1, String substring2) {
        return substring1.equals(substring2) ? 1 : 0;
    }
}
