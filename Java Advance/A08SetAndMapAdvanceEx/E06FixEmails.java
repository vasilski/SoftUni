package A08SetAndMapAdvanceEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E06FixEmails {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, String> miner = new LinkedHashMap<>();

        while (!"stop".equals(input)) {

            String email = scan.nextLine();
            String endEmail = email.substring(email.length()-3, email.length());

            if (!endEmail.equals(".us") && !endEmail.equals(".uk") && !endEmail.equals("com")) {
                miner.put(input, email);
            }

            input = scan.nextLine();
        }

        for (Map.Entry<String, String> entry : miner.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
