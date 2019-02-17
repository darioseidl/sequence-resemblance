package e2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ResemblanceTest {

    @Test
    void resemblance1() {
        int expected = new Resemblance().resemblance("abc", "abd");
        Assertions.assertEquals(2, expected);
    }




    @Test
    void resemblance2() {
        int expected = new Resemblance().resemblance("aaa", "aaab");
        Assertions.assertEquals(3, expected);
    }
}