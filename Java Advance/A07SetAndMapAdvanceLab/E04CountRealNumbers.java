package A07SetAndMapAdvanceLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04CountRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");

        Map<Double, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            double number = Double.parseDouble(input[i]);

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        for (Map.Entry<Double, Integer> en : map.entrySet()) {
            System.out.printf("%.1f -> %d%n", en.getKey(), en.getValue());
        }
    }
}
