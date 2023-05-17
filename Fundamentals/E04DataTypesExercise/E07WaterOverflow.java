package E04DataTypesExercise;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int receiveLiters = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scan.nextLine());

            if ((receiveLiters + liters) <= 255) {
                receiveLiters += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(receiveLiters);
    }
}
