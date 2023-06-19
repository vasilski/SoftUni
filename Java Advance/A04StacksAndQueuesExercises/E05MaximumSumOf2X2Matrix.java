package A05MiltidimensionalArrayLab;

import java.util.Scanner;

public class E05MaximumSumOf2X2Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] rowsAndCols = scan.nextLine().replaceAll(",", "").split("\\s+");

        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] input = scan.nextLine().replaceAll(",", "").split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int indexRow = 0;
        int indexCol = 0;


        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {

                int sum = 0;
                sum += matrix[row][col];
                sum += matrix[row][col + 1];
                sum += matrix[row + 1][col];
                sum += matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    indexRow = row;
                    indexCol = col;
                }

            }
        }

        System.out.printf("%d %d%n", matrix[indexRow][indexCol], matrix[indexRow][indexCol + 1]);
        System.out.printf("%d %d%n", matrix[indexRow + 1][indexCol], matrix[indexRow + 1][indexCol + 1]);
        System.out.println(maxSum);

    }
}
