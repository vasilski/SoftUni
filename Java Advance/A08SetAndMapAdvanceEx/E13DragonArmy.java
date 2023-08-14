package A08SetAndMapAdvanceEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E13DragonArmy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, int[]>> dragons = new LinkedHashMap<>();

        while (n-- > 0) {

            String[] tokens = scan.nextLine().split("\\s+");

            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }

            dragons.get(type).putIfAbsent(name, new int[]{damage, health, armor});
            dragons.get(type).put(name, new int[]{damage, health, armor});
        }

        dragons.forEach((key, value) -> {
            double[] avg = new double[3];
            value.forEach((k, v) -> {
                avg[0] += v[0];
                avg[1] += v[1];
                avg[2] += v[2];
            });

            avg[0] /= value.size();
            avg[1] /= value.size();
            avg[2] /= value.size();

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, avg[0], avg[1], avg[2]);

            value.forEach((k, v) -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                        k,
                        v[0],
                        v[1],
                        v[2]
                );
            });
        });
    }
}