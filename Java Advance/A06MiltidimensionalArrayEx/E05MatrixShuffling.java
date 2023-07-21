package A06MiltidimensionalArrayEx;

import java.util.Scanner;

public class E05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] size = scan.nextLine().split("\\s+");

        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = scan.nextLine().split("\\s+");
        }

        String command = scan.nextLine();

        while (!command.equals("END")) {

            try {
                String[] tokens = command.split("\\s+");

                if (!tokens[0].equals("swap") || tokens.length > 5) {
                    throw new IllegalStateException();
                }

                int rowFirstElement = Integer.parseInt(tokens[1]);
                int colFirstElement = Integer.parseInt(tokens[2]);
                int rowSecondElement = Integer.parseInt(tokens[3]);
                int colSecondElement = Integer.parseInt(tokens[4]);

                String temp = matrix[rowFirstElement][colFirstElement];
                matrix[rowFirstElement][colFirstElement] = matrix[rowSecondElement][colSecondElement];
                matrix[rowSecondElement][colSecondElement] = temp;

                printMatrix(matrix);
            } catch (IndexOutOfBoundsException | IllegalStateException ex) {
                System.out.println("Invalid input!");
            }


            command = scan.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}
