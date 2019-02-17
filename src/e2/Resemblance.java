package e2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Resemblance {
    public static void main(String[] args) {
        int resemblance = resemblance("aabcdefx", "aabcdxxxxxxxxxxxxx");
        System.out.println(resemblance);
    }

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

        List<Boolean> collect = IntStream.range(1, minLength).mapToObj(i -> {
            String substring1 = sequence1.substring(0, i);
            String substring2 = sequence2.substring(0, i);

            if (substring1.equals(substring2)) {
                System.out.println("same: " + substring1 + "=" + substring1);
                return true;
            } else {
//                System.out.println("difference: " + substring1 + "!=" + substring2);
                return false;
            }
        }).collect(Collectors.toList());

        System.out.println(collect);

        return 0;
    }
}
