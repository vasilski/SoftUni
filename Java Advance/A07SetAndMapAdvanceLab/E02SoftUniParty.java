package A07SetAndMapAdvanceLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class E02SoftUniParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Set<String> guest = new TreeSet<>();

        while (!"PARTY".equals(input)) {
            guest.add(input);

            input = scan.nextLine();
        }

        while (!"END".equals(input)) {
            guest.remove(input);

            input = scan.nextLine();
        }
        guest.stream().sorted();
        String output = guest.stream().collect(Collectors.joining(System.lineSeparator()));

        System.out.println(guest.size());
        System.out.println(output);
    }
}