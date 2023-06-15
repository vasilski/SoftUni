package E18TextProccessing;

import java.util.Scanner;

public class E01ReverseStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!"end".equals(input)) {

            String reverse = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                 reverse += input.charAt(i);

            }
            System.out.printf("%s = %s%n", input, reverse);

            input = scan.nextLine();
        }
    }
}
