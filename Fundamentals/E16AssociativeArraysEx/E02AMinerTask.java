package E16AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02AMinerTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashMap<String, Integer> miner = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scan.nextLine());

            if (!miner.containsKey(input)) {
                miner.put(input, quantity);
            } else {
                miner.put(input, miner.get(input) + quantity);
            }

            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

        System.out.println();
    }
}
