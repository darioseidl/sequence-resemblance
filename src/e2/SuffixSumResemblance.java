package e2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SuffixSumResemblance {

    public static void main(String[] args) {
        System.out.println(suffixSumResemblance("ababaa"));
    }

    public static Object suffixSumResemblance(String sequence) {
        return IntStream
                .range(0, sequence.length())
                .map(i -> {
                    int resemblance = Resemblance.resemblance(sequence, sequence.substring(i, sequence.length()));
                    System.out.println("sequence: " + sequence);
                    System.out.println("substring: " + sequence.substring(i, sequence.length()));
                    System.out.println(resemblance);
                    return resemblance;
                }).sum();

    }
}
