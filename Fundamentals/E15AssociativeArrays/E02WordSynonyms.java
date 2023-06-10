package E15AssociativeArrays;

import java.util.*;

public class E02WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countInput = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        for (int i = 0; i < countInput; i++) {
             String word = scan.nextLine();
             String synonym = scan.nextLine();

             if (!synonymDictionary.containsKey(word)) {
                 List<String> currentWordsSynonym = new ArrayList<>();
                 currentWordsSynonym.add(synonym);
                 synonymDictionary.put(word, currentWordsSynonym);
             } else {
                 List<String> currentWordsSynonym = synonymDictionary.get(word);
                 currentWordsSynonym.add(synonym);
                 synonymDictionary.put(word, currentWordsSynonym);
             }
        }

        for (Map.Entry<String, List<String>> wordEntry : synonymDictionary.entrySet()) {
            String word = wordEntry.getKey();
            List<String> currentWordsSynonym = wordEntry.getValue();

            System.out.printf("%s - %s%n", word, String.join(", ", currentWordsSynonym));
        }
    }
}
