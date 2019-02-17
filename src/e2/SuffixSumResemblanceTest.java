package e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SuffixSumResemblanceTest {
    @Test
    void suffixSum1() {
        int expected = new SuffixSumResemblance().suffixSumResemblance("ababaa");
        Assertions.assertEquals(11, expected);
    }

    @Test
    void suffixSum2() {
        int expected = new SuffixSumResemblance().suffixSumResemblance("aa");
        Assertions.assertEquals(3, expected);


    }


}