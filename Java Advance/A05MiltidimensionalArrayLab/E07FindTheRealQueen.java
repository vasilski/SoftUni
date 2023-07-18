package A02StacksAndQueues;

import java.util.Scanner;

public class E07FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int size = 8;

        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            String[] line = scan.nextLine().split("\\s+");
            for (int k = 0; k < line.length; k++) {
                board[i][k] = line[k].charAt(0);
            }
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (board[row][col] == 'q') {
                    boolean isColValid = checkQueenCol(board, col);
                    boolean isRowValid = checkQueenRow(board, row);
                    boolean isMainDiagonalValidUpAndLeft = checkMainDiagonalUpLeft(board, row, col);
                    boolean isMainDiagonalValidUpAndRight = checkMainDiagonalUpRight(board, row, col);
                    boolean isSecondaryDiagonalValidUpAndRight = checkSecondaryDiagonalUpRight(board, row, col);
                    boolean isSecondaryDiagonalValidDownAndLeft = checkSecondaryDiagonalDownAndLeft(board, row, col);

                    if (isColValid && isRowValid && isMainDiagonalValidUpAndLeft &&
                            isMainDiagonalValidUpAndRight &&
                            isSecondaryDiagonalValidUpAndRight &&
                            isSecondaryDiagonalValidDownAndLeft) {
                        System.out.println(row + " " + col);
                        return;
                    }
                }
            }
        }

        System.out.println();
    }

    private static boolean checkSecondaryDiagonalDownAndLeft(char[][] board, int row, int col) {
        row++;
        col--;
        while (row < 8 && col >= 0) {
            if (board[row++][col--] == 'q') {
                return false;
            }
        }
        return true;

    }

    private static boolean checkSecondaryDiagonalUpRight(char[][] board, int row, int col) {
            row--;
            col++;
            while (row >= 0 && col <= 0) {
                if (board[row--][col++] == 'q') {
                    return false;
                }
            }
            return true;
    }

    private static boolean checkMainDiagonalUpRight(char[][] board, int row, int col) {
        row++;
        col++;
        while (row < 8 && col < 8) {
            if (board[row++][col++] == 'q') {
                return false;
            }
        }
        return true;


    }

    private static boolean checkMainDiagonalUpLeft(char[][] board, int row, int col) {
        row--;
        col--;
        while (row >= 0 && col >= 0) {
            if (board[row--][col--] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkQueenCol(char[][] board, int col) {
        int queens = 0;

        for (int i = 0; i < board.length; i++) {
            char symbol = board[i][col];
            if (symbol == 'q') {
                queens++;
            }
        }

        return queens == 1;
    }


    private static boolean checkQueenRow(char[][] board, int row) {
        int queens = 0;

        for (int i = 0; i < board.length; i++) {
            char symbol = board[row][i];
            if (symbol == 'q') {
                queens++;
            }
        }

        return queens == 1;
    }
}
