package E06ArraysExercise;

import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String[] firstArray = new String[n];
        String[] secondArray = new String[n];

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split("\\s+");

            if (i % 2 == 0) {
                firstArray[i] = input[0];
                secondArray[i] = input[1];
            } else {
                firstArray[i] = input[1];
                secondArray[i] = input[0];
            }
        }
        for (String first : firstArray) {
            System.out.print(first + " ");
        }
        System.out.println();

        for (String s : secondArray) {
            System.out.print(s + " ");
        }

    }
}
