package E02BasicSyntaxExercise.MoreEx;

import java.util.Scanner;

public class E01SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        int temp;

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        if (c > b) {
            temp = b;
            b = c;
            c = temp;
        }

        if (b > a) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
