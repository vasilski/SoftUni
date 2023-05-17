package E06ArraysExercise;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i <numbers.length ; i++) {
            boolean isBugger = true;
            int currentNum = numbers[i];
            for (int k = i + 1; k <numbers.length ; k++) {
                int number = numbers[k];
                if (currentNum <= number) {
                    isBugger = false;
                }
            }
            if (isBugger) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
