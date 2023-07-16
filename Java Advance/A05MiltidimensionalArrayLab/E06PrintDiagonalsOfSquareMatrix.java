package A05MiltidimensionalArrayLab;

import java.util.Scanner;

public class E06PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int [][] matrix = new int[size][size];

        for (int row = 0; row < matrix.length; row++) {
            String[] input = scan.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = Integer.parseInt(input[col]);
            }
        }

        for (int i = 0; i < matrix.length ; i++) {
            System.out.printf("%d ",matrix[i][i]);
        }
        System.out.println();

        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0) {
            System.out.printf("%d ",matrix[row][col]);
            row--;
            col++;
        }
    }
}
