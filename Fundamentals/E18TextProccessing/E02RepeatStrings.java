package E18TextProccessing;

import java.util.Scanner;

public class E02RepeatStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}
