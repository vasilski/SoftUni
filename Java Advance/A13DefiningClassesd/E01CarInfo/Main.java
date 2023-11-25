package A13DefiningClassesd.E01CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < count; i++) {
            String[] token = scan.nextLine().split(" ");
            String brand = token[0];
            String model = token[1];
            int horsePower = Integer.parseInt(token[2]);

            Car car = new Car(brand, model, horsePower);
            carInfo(car);
        }

    }

    private static void carInfo(Car car) {
        System.out.println(String.format(
                "The car is: %s %s - %d HP.",
                car.getBrand(), car.getModel(), car.getHorsePower()
        ));
    }
}
