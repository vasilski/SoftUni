package E07Methods;

import java.util.Scanner;

public class A05Orders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();

        int quantity = Integer.parseInt(scan.nextLine());

        calculateOrder(product, quantity);
    }

    private static void calculateOrder(String product, int quantity) {

        double priceOrder = 0;
        if (product.equals("coffee")) {
        priceOrder =  quantity * 1.5;
        } else if (product.equals("water")) {
            priceOrder =  quantity * 1.0;
        } else if (product.equals("coke")) {
            priceOrder =  quantity * 1.4;
        } else if (product.equals("snacks")) {
            priceOrder =  quantity * 2.0;
        }
        System.out.printf("%.2f", priceOrder);
    }
}
