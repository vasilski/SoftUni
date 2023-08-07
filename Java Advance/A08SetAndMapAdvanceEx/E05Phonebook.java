package A08SetAndMapAdvanceEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05Phonebook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, String> phonebook = new LinkedHashMap<>();

        while (!"search".equals(input)) {
            String[] token = input.split("-");
            String name = token[0];
            String number = token[1];

            phonebook.put(name, number);

            input = scan.nextLine();
        }

        input = scan.nextLine();

        while (!"stop".equals(input)) {
            if (!phonebook.containsKey(input)) {
                System.out.printf("Contact %s does not exist.%n", input);
            } else {
                System.out.printf("%s -> %s%n",input, phonebook.get(input));
            }

            input = scan.nextLine();
        }
    }
}
