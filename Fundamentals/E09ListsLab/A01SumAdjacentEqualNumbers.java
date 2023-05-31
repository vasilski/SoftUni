package E09ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            numbers.add(Double.parseDouble(input[i]));
        }
        int i = 0;
        while (i < numbers.size() - 1) {
            double currentNumber = numbers.get(i);
            double nextNumber = numbers.get(i + 1);
            if (currentNumber == (nextNumber)){
                double sum = currentNumber + nextNumber;
                numbers.set(i, sum);
                numbers.remove(i + 1);
                i = 0;
            } else {
                i++;
            }
        }

        for (double number: numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }
    }
}
