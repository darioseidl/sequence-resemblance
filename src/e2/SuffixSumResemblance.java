package e2;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SuffixSumResemblance {

    public static void main(String[] args) {
        System.out.println("Give me a sequence ? " );
        Scanner scanner = new Scanner(System.in);
        String sequence =scanner.nextLine();
        Object sum = suffixSumResemblance(sequence);
        System.out.println(sum);
    }

    public static int suffixSumResemblance(String sequence) {
        return IntStream
                .range(0, sequence.length())
                .map(i -> Resemblance.resemblance(sequence, sequence.substring(i, sequence.length()))).sum();

    }

//    public static int suffixSumResemblance(String sequence) {
//        return IntStream
//                .range(0, sequence.length())
//                .map(i -> {
//                    int resemblance = Resemblance.resemblance(sequence, sequence.substring(i, sequence.length()));
//                    System.out.println("sequence: " + sequence);
//                    System.out.println("substring: " + sequence.substring(i, sequence.length()));
//                    System.out.println(resemblance);
//                    return resemblance;

//                }).sum();

//    }
}
