package E05ArraysLab;

import java.util.Scanner;

public class E03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] numbersLine = scan.nextLine().split(" ");
        int[] numbers = new int[numbersLine.length];
        int sum = 0;

        for (int i = 0; i < numbersLine.length; i++) {
            numbers[i] = Integer.parseInt(numbersLine[i]);
        }

        for (int k = 0; k < numbers.length; k++) {
            if (numbers[k] % 2 == 0) {
                sum += numbers[k];
            }
        }

        System.out.println(sum);
    }
}
