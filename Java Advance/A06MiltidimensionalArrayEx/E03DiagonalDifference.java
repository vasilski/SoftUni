package A06MiltidimensionalArrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class E03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

        }

        int primarySum = calcPrimarySum(matrix);
        int secondarySum = calcSecondarySum(matrix);

        System.out.println(Math.abs(primarySum - secondarySum));
    }

    private static int calcSecondarySum(int[][] matrix) {
        int sum = 0;
        int col = matrix.length - 1;

        for (int row = 0; row < matrix.length; row++) {
            sum += matrix[row][col--];

        }

        return sum;
    }

    private static int calcPrimarySum(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        return sum;
    }
}
