package e2;

import java.util.Scanner;

public class ResemblanceApplication {

    public static void main(String[] args) {
        System.out.println("Give me a sequence ? " );
        Scanner scanner = new Scanner(System.in);
        String sequence =scanner.nextLine();
        Object sum = new SuffixSumResemblance().suffixSumResemblance(sequence);
        System.out.println(sum);
    }

}
