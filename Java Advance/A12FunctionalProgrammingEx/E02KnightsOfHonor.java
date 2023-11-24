package A12FunctionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class E02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Consumer<String> consumer = n -> System.out.println("Sir " + n);

        Arrays.stream(scan.nextLine().split("\\s+")).forEach(consumer);

    }
}
