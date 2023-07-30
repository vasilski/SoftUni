package A07SetAndMapAdvanceLab;

import java.util.*;

public class E06ProductShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        while (!"Revision".equals(input)) {
            String[] tokens = input.split(", ");

            String shop = tokens[0];
            String products = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).putIfAbsent(products, price);

            input = scan.nextLine();
        }

        shops.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + "->");
                    entry.getValue()
                            .forEach((k, v) -> {
                                System.out.printf("Product: %s, Price: %.1f%n", k, v);
                            });
                });
    }
}
