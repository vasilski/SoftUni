package A06MiltidimensionalArrayEx;

import java.util.Scanner;

public class E04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = readIntMatrix(rows, cols, scan);

        int totalSum = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                 totalSum += matrix[row][col];
            }

        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(totalSum);
    }


    private static int[][] readIntMatrix(int rows, int cols, Scanner scan) {

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scan.nextLine().split(", ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        return matrix;
    }
}
