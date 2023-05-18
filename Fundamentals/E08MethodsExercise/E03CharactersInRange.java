package E08MethodsExercise;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);

        rangeChar(first, second);

    }

    private static void rangeChar(char first, char second) {
        int start = (int)first;
        int end = (int)second;
        if (start > end) {
            int temp = end;
            end = start;
            start = temp;
        }
        for (int i = start + 1; i < end; i++) {
            char character = (char) i;
            System.out.print(character + " ");
        }

    }
}
