package A02StacksAndQueues;

import java.util.Arrays;
import java.util.Scanner;

public class E08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int r = scan.nextInt();
        int c = scan.nextInt();

        int wrongValue = matrix[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wrongValue) {
                    int validValue = getValue(matrix, i, j, wrongValue);
                    matrix[i][j] = validValue;

                    //System.out.println(validValue);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[i].length; k++) {
                System.out.print(matrix[i][k] + " ");
            }
            System.out.println();
        }
    }

    private static int getValue(int[][] matrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (isBounds(matrix, row + 1, col) && matrix[row + 1][col] != wrongValue) {
            sum += matrix[row + 1][col];
        }

        if (isBounds(matrix, row - 1, col) && matrix[row - 1][col] != wrongValue) {
            sum += matrix[row - 1][col];
        }

        if (isBounds(matrix, row, col + 1) && matrix[row][col + 1] != wrongValue) {
            sum += matrix[row][col + 1];
        }
        if (isBounds(matrix, row, col - 1) && matrix[row ][col - 1] != wrongValue) {
            sum += matrix[row][col - 1];

        }


        return sum;
    }

    private static boolean isBounds(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }
}
