package A06MiltidimensionalArrayEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E12Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = scan.nextInt();
        int cols = scan.nextInt();
        scan.nextLine();

        Matrix matrix = new Matrix(rows, cols);
        matrix.setMatrix(readMatrixInfo(scan, rows));

        char fillColor = scan.nextLine().charAt(0);
        int row = scan.nextInt();
        int col = scan.nextInt();

        Bucket bucket = new Bucket(row, col, matrix);
        bucket.paint(fillColor);
        System.out.println(matrix.toString());

    }

    public static List<String> readMatrixInfo(Scanner scan, int linesCount) {
        List<String> lines = new ArrayList<>();
        while (linesCount-- > 0) {
            lines.add(scan.nextLine().replaceAll("\\s+", ""));
        }
        return lines;
    }
    public static class Bucket {
        private int row;
        private int col;
        private char colorToReplace;
        private char fillColor;
        private Matrix matrix;

        public Bucket(int row, int col, Matrix matrix) {
            this.row = row;
            this.col = col;
            this.colorToReplace = matrix.getCell(row, col);
            this.matrix = matrix;
        }
        public void paint(char fillColor) {
            //dfs
            paint(row, col, colorToReplace, fillColor, matrix);
        }

        public void paint(int row, int col, char colorToReplace, char fillColor, Matrix matrix) {
            if (matrix.isOutOfBounds(row, col)
                    || matrix.getCell(row, col) != colorToReplace
                    || matrix.getCell(row, col) == fillColor) {
                return;
            }
            matrix.setCell(row, col, fillColor);


            //Up
            paint(row - 1, col, colorToReplace, fillColor, matrix);
            //Down
            paint(row + 1, col, colorToReplace, fillColor, matrix);
            //Left
            paint(row, col - 1, colorToReplace, fillColor, matrix);
            //Right
            paint(row, col + 1, colorToReplace, fillColor, matrix);
        }
    }
    public static class Matrix {
        private int rows;
        private int cols;
        private char[][] matrix;

        public Matrix (int rows, int cols) {
            this.rows = rows;
            this.cols = cols;
            this.matrix = new char[this.rows][this.cols];
        }

        public void setMatrix(List<String> lines) {
            for (int row = 0; row < lines.size(); row++) {
                this.matrix[row] = lines.get(row).toCharArray();
            }
        }

        public char getCell(int row, int col) {
            return this.matrix[row][col];
        }

        public void setCell(int row, int col, char fillColor) {
            this.matrix[row][col] = fillColor;

        }

        public boolean isOutOfBounds(int row, int col) {
            return row >= rows || row < 0 || col >= cols || col < 0;
        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    builder.append(matrix[row][col]);
                }
                builder.append(System.lineSeparator());
            }
            return builder.toString();

        }
    }
}
