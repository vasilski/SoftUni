package E06ArraysExercise;

import java.util.Scanner;

public class E01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        int[] train = new int[count];
        for (int i = 0; i < count; i++) {
            int passenger = Integer.parseInt(scan.nextLine());
            train[i] = passenger;
        }

        int totalPassengers = 0;

        for (int people : train) {
            totalPassengers += people;
            System.out.printf("%s ", people);

        }
        System.out.println();
        System.out.println(totalPassengers);
    }
}
