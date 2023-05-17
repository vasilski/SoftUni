package A01BasicSyntax;

import java.util.Scanner;

public class E10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n*i);
        }
    }
}
