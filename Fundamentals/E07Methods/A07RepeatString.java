package E07Methods;

import java.util.Scanner;

public class A07RepeatString {

    private static String repeatString (String input, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
           output += input;

        }
        return  output;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        System.out.println(repeatString(input, count));
    }
}
