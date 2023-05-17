package A01BasicSyntax;

import java.util.Scanner;

public class E07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String day = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        if ("Weekday".equals(day)) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                System.out.println("12$");
            } else if (age >= 18 && age <= 64) {
                System.out.println("18$");
            } else {
                System.out.println("Error!");
            }
        } else if ("Weekend".equals(day)) {
            if (age >= 0 && age <= 18 || age > 64 && age <= 122) {
                System.out.println("15$");
            } else if (age >= 18 && age <= 64) {
                System.out.println("20$");
            } else {
                System.out.println("Error!");
            }
        } else if ("Holiday".equals(day)) {
            if (age >= 0 && age <= 18) {
                System.out.println("5$");
            } else if (age > 64 && age <= 122) {
                System.out.println("10$");
            } else if (age >= 18 && age <= 64) {
                System.out.println("12$");
            } else {
                System.out.println("Error!");
            }
        }
    }
}