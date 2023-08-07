package A08SetAndMapAdvanceEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E06AMinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Integer> miner = new LinkedHashMap<>();

        while (!"stop".equals(input)) {

            int quantity = Integer.parseInt(scan.nextLine());

            if (miner.containsKey(input)) {
                miner.put(input, miner.get(input) + quantity);
            }
            miner.putIfAbsent(input, quantity);

            input = scan.nextLine();
        }

        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}