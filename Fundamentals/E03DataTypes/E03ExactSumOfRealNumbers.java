package E03DataTypes;

import java.math.BigDecimal;
import java.util.Scanner;

public class E03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        BigDecimal totalSum = new BigDecimal(0);

        while (1 <= count) {
            String input = scan.nextLine();
            count--;
            BigDecimal number = new BigDecimal(input);
            totalSum = number.add(totalSum);

        }
        System.out.println(totalSum);

    }
}
