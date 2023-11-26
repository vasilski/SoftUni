package A12FunctionalProgrammingEx;

import java.beans.IntrospectionException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class E04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int[]> addOne = arr -> Arrays.stream(arr).map(e -> e += 1).toArray();
        Function<int[], int[]> subtractOne = arr -> Arrays.stream(arr).map(e -> e -= 1).toArray();
        Function<int[], int[]> multiplyBuTwo = arr -> Arrays.stream(arr).map(e -> e *= 2).toArray();
        Consumer<int[]> printNumbers = arr -> Arrays.stream(arr).forEach(e -> System.out.print(e + " "));

        String command = "";

        while (!"end".equals(command)) {

            switch (command) {
                case "add":
                      number = addOne.apply(number);
                    break;
                case "multiply":
                    number = multiplyBuTwo.apply(number);
                    break;
                case "subtract":
                    number = subtractOne.apply(number);
                    break;
                case "print":
                    printNumbers.accept(number);
                    System.out.println();
                    break;
            }




            command = scan.nextLine();
        }
    }
}
