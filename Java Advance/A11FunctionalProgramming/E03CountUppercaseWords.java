package A11FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Predicate<String> startWhitUppercase
                = str -> str!= null && !str.isEmpty()
                && Character.isUpperCase(str.charAt(0));

        List<String> stringList = Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(startWhitUppercase)
                .collect(Collectors.toList());

        System.out.println(stringList.size());
        System.out.println(stringList.stream()
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
