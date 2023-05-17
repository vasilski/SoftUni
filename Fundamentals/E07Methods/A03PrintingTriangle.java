package E07Methods;

import java.util.Scanner;

public class A03PrintingTriangle {
    private static void secondParts(int num) {
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
        }
    }

    private static void firstParts(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        firstParts(num);
        secondParts(num);

    }
}
