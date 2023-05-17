package E03DataTypes;

import java.util.Scanner;

public class E02PoundsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dollars = Double.parseDouble(scan.nextLine());

        double pounds = dollars * 1.36;

        System.out.printf("%.03f", pounds);
    }
}
