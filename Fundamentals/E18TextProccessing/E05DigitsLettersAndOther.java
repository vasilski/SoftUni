package E18TextProccessing;

import java.util.Scanner;

public class E05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        char[] chars = input.toCharArray();
        String digit = "";
        String letter = "";
        String others = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = chars[i];
            int chNum = ch;
            if (Character.isDigit(ch)) {
                digit += ch;
            } else if (chNum > 64 && chNum < 91 || chNum > 96 && chNum < 123) {
                letter += ch;
            } else {
                others += ch;
            }
        }

        System.out.println(digit);
        System.out.println(letter);
        System.out.println(others);
    }
}
