package A11FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class E02SumNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

               int[] numbers = Arrays.stream(scan.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                       .toArray();


        System.out.println("Count = " + Arrays.stream(numbers).count());
        System.out.println("Sum = " + Arrays.stream(numbers).sum());
    }
}
