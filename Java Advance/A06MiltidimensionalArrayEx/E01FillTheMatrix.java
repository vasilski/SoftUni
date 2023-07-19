package A06MiltidimensionalArrayEx;

import java.util.Scanner;

public class E01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        char pattern = input[1].charAt(0);

        int[][] matrix = new int[rows][];

        if (pattern == 'A') {
            matrix = fillTopToBottom(rows);
        }

        if (pattern == 'B') {
            matrix = fillTopToRight(rows);
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] fillTopToBottom(int rows) {
        int[][] matrix = new int[rows][rows];

        int counter =0;
        for (int col = 0; col < rows ; col++) {
            for (int row = 0; row < rows ; row++) {
                counter++;
                matrix[row][col] = counter;
            }
        }

        return matrix;
    }

    private static int[][] fillTopToRight(int rows) {
        int[][] matrix = new int[rows][rows];
        int counter =0;
        for (int col = 0; col < rows ; col++) {
            if (col % 2 == 1) {
                for (int row = rows -1; row >= 0; row--) {
                    counter++;
                    matrix[row][col] = counter;
                }
            } else {
                for (int row = 0; row < rows; row++) {
                    counter++;
                    matrix[row][col] = counter;
                }
            }
        }

        return matrix;
    }
}
