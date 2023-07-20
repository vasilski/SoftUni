package A06MiltidimensionalArrayEx;

import java.util.Scanner;

public class E02MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print("" + (char) ('a' + row) + (char) ('a' + row + col) + (char) ('a' + row) + ' ');
            }
            System.out.println();
        }
    }
}
