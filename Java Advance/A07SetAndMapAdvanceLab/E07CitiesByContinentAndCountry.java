package A07SetAndMapAdvanceLab;

import java.util.*;

public class E07CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, Map<String, List<String>>> info = new LinkedHashMap<>();

        while (n-- > 0) {
          String[] tokens = scan.nextLine().split("\\s+");

          String continent = tokens[0];
          String country = tokens[1];
          String city = tokens[2];

          info.putIfAbsent(continent, new LinkedHashMap<>());
          info.get(continent).putIfAbsent(country, new ArrayList<>());
          info.get(continent).get(country).add(city);
        }

        info.entrySet().stream()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");
                    entry.getValue()
                            .forEach((k, v) -> {
                                System.out.printf(" %s -> %s%n", k,
                                        String.join(", ", v));
                            });
                });
    }
}
