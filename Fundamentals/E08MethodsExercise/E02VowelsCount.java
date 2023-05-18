package E08MethodsExercise;

import java.util.Locale;
import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        countVowels(input.toLowerCase(Locale.ROOT));
    }

    private static void countVowels(String input) {
        char[] words = input.toCharArray();
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            char word = words[i];

            switch (word) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    counter++;
                    break;
            }
        }
        System.out.println(counter);
    }
}
