package A12FunctionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class E03CustomMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Function<int[], Integer> grtMinElement = x -> Arrays.stream(x).min().getAsInt();

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Integer minElements = grtMinElement.apply(numbers);

        System.out.println(minElements);
    }
}
