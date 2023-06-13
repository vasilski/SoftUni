package E16AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        while (number-- > 0) {
            String[] input = scan.nextLine().split("\\s+");
            String name = input[1];
            switch (input[0]) {
                case "register":
                    String plateNumber = input[2];
                    if (!parking.containsKey(name)) {
                    parking.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n",name, plateNumber);
                } else if (parking.containsKey(name)){
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }
                break;

                case "unregister":
                    if (!parking.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        parking.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;

            }
        }

        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
