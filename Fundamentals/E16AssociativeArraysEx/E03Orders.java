package E16AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E03Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Map<String, Double> order = new LinkedHashMap<>();
        Map<String, Double> product = new LinkedHashMap<>();

        while (!input[0].equals("buy")) {

            String productName = input[0];
            double productPrice = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);


            if (!order.containsKey(productName)) {
               order.put(productName, quantity);
            } else {
                order.put(productName, order.get(productName) + quantity);
            }

            if (!product.containsKey(productName)) {
                product.put(productName, productPrice);
            } else {
                product.put(productName, productPrice);
            }

            input = scan.nextLine().split("\\s+");
        }

        for (Map.Entry<String, Double> entry : order.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue() * product.get(entry.getKey()));
        }
    }
}
