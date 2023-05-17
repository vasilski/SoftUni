package A01BasicSyntax;

import java.util.Scanner;

public class E11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (num1 > 10 || num2 > 10) {
            System.out.printf("%d X %d = %d%n", num1, num2, num1*num2);
        } else {
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num1, i, i*num1);
            }
        }
    }
}
