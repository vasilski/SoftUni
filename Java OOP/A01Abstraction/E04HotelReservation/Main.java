package A01Abstraction.E04HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] tokens = scan.nextLine().split("\\s+");

        PriceCalculator priceCalculator = new PriceCalculator(
                Double.parseDouble(tokens[0]), Integer.parseInt(tokens[1]),
                Season.valueOf(tokens[2].toUpperCase()),
                tokens[3].equals("SecondVisit") ? DiscountType.SECOND_VISIT :
                        DiscountType.valueOf(tokens[3].toUpperCase()));

        System.out.printf("%.2f%n", priceCalculator.calculate());
    }
}
