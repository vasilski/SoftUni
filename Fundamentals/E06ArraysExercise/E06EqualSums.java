package E06ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E06EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;

        for (int index = 0; index < numbers.length; index++) {
            int currentElement = numbers[index];
            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];
            }
            for (int rightIndex = index + 1; rightIndex < numbers.length; rightIndex++) {
                rightSum += numbers[rightIndex];

            }
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("no");
        }

    }
}
