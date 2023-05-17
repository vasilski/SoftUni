package E06ArraysExercise;

import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int target = Integer.parseInt(scan.nextLine());
        int[] numbers = new int[input.length];
        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int firstNumber = numbers[i];
            for (int k = i + 1; k <numbers.length ; k++) {
                    int secondNumber = numbers[k];
                    if (firstNumber + secondNumber == target) {
                        System.out.printf("%d %d%n", firstNumber, secondNumber);
                    }
            }
        }
    }
}
