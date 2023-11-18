package A11FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class E04AddVAT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        UnaryOperator<Double> addVat = val -> val * 1.2;


        String values = Arrays.stream(scan.nextLine().split(", "))
                .map(e -> String.format("%.2f", addVat.apply(Double.parseDouble(e))))
                .collect(Collectors.joining(System.lineSeparator()));

        System.out.println("Prices with VAT:");
        System.out.println(values);
    }
}
