package E03DataTypes;

import java.util.Scanner;

public class E01ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double meters = Double.parseDouble(scan.nextLine());

        double kilometers = meters / 1000;

        System.out.printf("%.2f", kilometers);
    }
}

