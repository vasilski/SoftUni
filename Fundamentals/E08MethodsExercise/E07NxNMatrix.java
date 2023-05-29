package E08MethodsExercise;

import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        creatMatrix(n);
    }

    private static void creatMatrix(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
