package A12FunctionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;

public class E01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Arrays.stream(scan.nextLine().split("\\s+")).forEach(System.out::println);
    }
}
