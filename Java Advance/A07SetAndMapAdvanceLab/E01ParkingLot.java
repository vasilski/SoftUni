package A07SetAndMapAdvanceLab;

import java.util.*;

public class E01ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        while (!"END".equals(input)) {
            String[] tokens = input.split(", ");
            String command = tokens[0];
            String plateNumber = tokens[1];

            if ("IN".equals(command)) {
                parking.add(plateNumber);
            }
            if ("OUT".equals(command)) {
                parking.remove(plateNumber);
            }

            input = scan.nextLine();
        }

        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String cars : parking) {
                System.out.println(cars);
            }
        }
    }
}