package E04DataTypesExercise;

import java.util.Scanner;

public class E04SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (count > 0) {
            count--;
            char ch = scan.nextLine().charAt(0);
            int num = (int) ch;
            sum += num;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
