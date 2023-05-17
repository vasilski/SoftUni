package E04DataTypesExercise;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int number = Integer.parseInt(String.valueOf(ch));
            sum += number;
        }

        System.out.println(sum);
    }
}
