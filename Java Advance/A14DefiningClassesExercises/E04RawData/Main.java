package A14DefiningClassesExercises.E04RawData;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while (n--> 0) {
            String[] tokens = scan.nextLine().split("\\s+");
            String model = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);

            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];

            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tier[] tiers = new Tier[4];
            int tierCount = 0;

            for (int i = 5; i < tokens.length; i+=2) {
                double tierPressure = Double.parseDouble(tokens[i]);
                int tierAge = Integer.parseInt(tokens[i + 1]);
                tiers[tierCount] = new Tier(tierPressure, tierAge);
                tierCount++;
            }
            Car car = new Car(model, engine, cargo, tiers);
            cars.putIfAbsent(model, car);
        }

        String cargoType = scan.nextLine();
        for (Car car : cars.values()) {
            if ("flamable".equals(cargoType)
                    && "flamable".equals(car.getCargo().getType())
                    && car.getEngine().getEnginePower() > 250) {
                System.out.println(car);
            } else if ("fragile".equals(cargoType)
            && "fragile".equals(car.getCargo().getType())
            && car.hasTierWithLessPressureThanOne()) {
                System.out.println(car);
            }
        }
    }
}
