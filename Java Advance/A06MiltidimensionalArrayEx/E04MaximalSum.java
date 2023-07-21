package A06MiltidimensionalArrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class E04MaximalSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = arr[0];
        int cols = arr[1];

        int[][] matrix = new int[rows][cols];

        int indexRow = 0;
        int indexCol = 0;

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scan.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxSum = Integer.MIN_VALUE;

        for (int row = 1; row < rows - 1; row++) {
            for (int col = 1; col < cols - 1; col++) {
                int sum = calculateMatrixSum(matrix, row, col);
                if (maxSum < sum) {
                    maxSum = sum;
                    //save matrix
                    indexRow = row;
                    indexCol = col;
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        printMaxMatrix(matrix, indexRow, indexCol);
    }

    private static void printMaxMatrix(int[][] matrix, int indexRow, int indexCol) {
        for (int row = indexRow - 1; row <= indexRow + 1; row++) {
            for (int col = indexCol - 1; col <= indexCol + 1; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int calculateMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;

        //up left
        sum += matrix[row - 1][col - 1];
        //up
        sum += matrix[row - 1][col];
        //up right
        sum += matrix[row - 1][col + 1];
        //left
        sum += matrix[row][col - 1];
        //center
        sum += matrix[row][col];
        //right
        sum += matrix[row][col + 1];
        //down left
        sum += matrix[row + 1][col - 1];
        //down
        sum += matrix[row + 1][col];
        //down right
        sum += matrix[row + 1][col + 1];

        return sum;
    }
}
