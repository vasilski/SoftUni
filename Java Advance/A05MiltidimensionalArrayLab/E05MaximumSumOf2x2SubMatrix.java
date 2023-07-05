package A06MiltidimensionalArrayEx;

import java.util.Scanner;

public class E05MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] inputMatrix = readIntMatrix(rows, cols, scan);

        int sum = 0;
        int[][] maxElement = new int[2][2];

        for (int row = 0; row <= inputMatrix.length - 2; row++) {
            for (int col = 0; col <= inputMatrix[row].length - 2; col++) {
                int first = inputMatrix[row][col];
                int second = inputMatrix[row][col + 1];
                int third = inputMatrix[row + 1][col];
                int forth = inputMatrix[row + 1][col + 1];

                int totalSum = first + second + third + forth;

                if (totalSum > sum) {
                    sum = totalSum;
                    maxElement[0][0] = first;
                    maxElement[0][1] = second;
                    maxElement[1][0] = third;
                    maxElement[1][1] = forth;
                }
            }
        }
        for (int row = 0; row <= maxElement.length - 1; row++) {
            for (int col = 0; col <= maxElement[row].length - 1; col++) {
                System.out.print(maxElement[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
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
