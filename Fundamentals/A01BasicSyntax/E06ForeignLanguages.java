package A01BasicSyntax;

import java.util.Scanner;

public class E06ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String language = scan.nextLine();

        if ("England".equals(language) || "USA".equals(language)){
            System.out.println("English");
        } else if ("Spain".equals(language) || "Argentina".equals(language) || "Mexico".equals(language)) {
            System.out.println("Spanish");
        } else {
            System.out.println("unknown");
        }
    }
}
