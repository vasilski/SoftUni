package E05ArraysLab;

import java.util.Scanner;

public class E05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int [] numbers = new int[input.length];
        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);

            if (numbers[i] % 2 == 0) {
                sumEven += numbers[i];
            } else {
                sumOdd += numbers[i];
            }
        }
        int total = sumEven - sumOdd;

        System.out.println(total);
    }
}
