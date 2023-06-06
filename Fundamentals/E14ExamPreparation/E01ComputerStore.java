package E14ExamPreparation;

import java.util.Scanner;

public class E01ComputerStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double totalWithoutTaxes = 0;

        while (!input.equals("regular") && !input.equals("special")) {
            double productPrice = Double.parseDouble(input);

            if (productPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                totalWithoutTaxes += productPrice;
            }

            input = scan.nextLine();
        }

        if (totalWithoutTaxes == 0 ) {
            System.out.println("Invalid order!");
            return;
        }

        double taxes = totalWithoutTaxes * 0.2;
        double finalPrice = totalWithoutTaxes + taxes;

        if (input.equals("special")) {
            finalPrice = finalPrice * 0.9;
        }

        printReceipt(taxes, finalPrice, totalWithoutTaxes);
    }

    private static void printReceipt(double taxes, double finalPrice, double totalWithoutTaxes) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalWithoutTaxes);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", finalPrice);
    }
}
