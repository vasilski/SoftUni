package E05ArraysLab;

import java.util.Scanner;

public class E07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] number = input(scan);
        String[] input;

        while (number.length > 1) {
            int[] sumArray = new int[number.length - 1];
            for (int i = 0; i < sumArray.length; i++) {
                sumArray[i] += number[i] + number[i + 1];
            }
            number = sumArray;
        }
        System.out.println(number[0]);
    }

    private static int[] input(Scanner scan) {
        String[] input = scan.nextLine().split(" ");

        int[] number = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            number[i] = Integer.parseInt(input[i]);
        }
        return number;
    }
}
