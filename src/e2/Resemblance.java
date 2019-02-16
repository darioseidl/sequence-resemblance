package e2;

import java.util.Arrays;

public class Resemblance {
    public static void main(String[] args) {
        int resemblance = resemblance("aabcdef", "aabcdx");
        System.out.println(resemblance);
    }

    public static int resemblance(String sequence1, String sequence2) {

        int resemblance = 0;

        int minLength = Math.min(sequence1.length(), sequence2.length());

        for (int i = 0; i < minLength; i++) {
            char char1 = sequence1.charAt(i);
            char char2 = sequence2.charAt(i);

            if (char1 == char2) {
                System.out.println("same: " +  char1 + "=" + char1);
                resemblance = resemblance + 1;
            }
            else {
                System.out.println("difference: " + char1 + "!=" + char2);
                break;
            }
        }

        return resemblance;
    }
}
