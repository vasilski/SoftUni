package E15AssociativeArrays;

import java.util.*;

public class E03OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            String worldInLoweCase = word.toLowerCase();
            if (counts.containsKey(worldInLoweCase)) {
                counts.put(worldInLoweCase, counts.get(worldInLoweCase) + 1);
            } else {
                counts.put(worldInLoweCase, 1);
            }
        }
            ArrayList<String> odds = new ArrayList<>();

            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                if (entry.getValue() % 2 == 1) {
                    odds.add(entry.getKey());
                }
            }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
