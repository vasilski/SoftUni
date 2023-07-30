package A08SetAndMapAdvanceEx;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<String> username = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String name = scan.nextLine();
            username.add(name);
        }

        username.forEach(System.out::println);
    }
}
