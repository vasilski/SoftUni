package E08MethodsExercise;

import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        initially(firstNumber, secondNumber, thirdNumber);
    }

    private static void initially(int firstNumber, int secondNumber, int thirdNumber) {
        int smallest = firstNumber;

        if (secondNumber < smallest) {
            smallest = secondNumber;
        }

        if (thirdNumber < smallest) {
            smallest = thirdNumber;
        }

        System.out.println(smallest);
    }
}
