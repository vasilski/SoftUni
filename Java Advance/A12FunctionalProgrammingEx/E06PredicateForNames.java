package A12FunctionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class E06PredicateForNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int length  =Integer.parseInt(scan.nextLine());

       String[] names = scan.nextLine().split("\\s+");

        Predicate<String> lengthName = name -> name.length() <= length;

        Arrays.stream(names).filter(lengthName).forEach(System.out::println);

    }
}
