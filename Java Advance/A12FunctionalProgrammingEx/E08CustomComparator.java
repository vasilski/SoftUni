package A12FunctionalProgrammingEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E08CustomComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> comparator = (first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }
            return first.compareTo(second);
        };

        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}
