package E16AssociativeArraysEx;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().replace(" ", "");

        char[] charArr = input.toCharArray();


        LinkedHashMap<Character, Integer> counter = new LinkedHashMap<>();

        for (char c : charArr) {
            if (counter.containsKey(c)) {
                counter.put(c, counter.get(c) + 1);
            } else {
                counter.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(), entry.getValue());
        }
    }
}
