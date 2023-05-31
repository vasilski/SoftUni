package E09ListsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A02GaussTrick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        int size = numbers.size() / 2;

        for (int i = 0; i < size; i++) {
            int currentNumber = numbers.get(i);
            int nextNumber = numbers.get(numbers.size() - 1);
            int sum = currentNumber + nextNumber;
                numbers.set(i, sum);
                numbers.remove(numbers.size()  - 1);
               }


        for (int number: numbers) {
            System.out.print(number + " ");
        }
    }
}
