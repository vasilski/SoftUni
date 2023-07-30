package A08SetAndMapAdvanceEx;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class E02SetsOfElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine();

        Set<Integer> firstSetNumber = new LinkedHashSet<>();
        Set<Integer> secondSetNumber = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
             int number = Integer.parseInt(scan.nextLine());
             firstSetNumber.add(number);
        }

        for (int i = 0; i < m; i++) {
            int number = Integer.parseInt(scan.nextLine());
            secondSetNumber.add(number);
        }

        firstSetNumber.retainAll(secondSetNumber);
        System.out.println(firstSetNumber.toString().replaceAll("[\\[\\],]",""));

    }
}
