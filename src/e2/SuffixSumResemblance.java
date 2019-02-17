package e2;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SuffixSumResemblance {

    public int suffixSumResemblance(String sequence) {
        return IntStream
                .range(0, sequence.length())
                .map(i -> new Resemblance().resemblance(sequence, sequence.substring(i, sequence.length()))).sum();
    }

}
