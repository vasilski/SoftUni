package E08MethodsExercise;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        middleChar(input);
    }

    private static void middleChar(String input) {

        char[] array = input.toCharArray();

        if (array.length % 2 == 0) {
            int middle = array.length / 2;
            char first = array[middle - 1];
            char second = array[middle];

            System.out.print(first);
            System.out.print(second);
        } else {
            int middle = array.length / 2;
            char first = array[middle];

            System.out.println(first);
        }
    }
}