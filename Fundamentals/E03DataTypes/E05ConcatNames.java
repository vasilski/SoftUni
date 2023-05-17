package E03DataTypes;

import java.util.Scanner;

public class E05ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstContact = scan.nextLine();
        String secondContact = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.println(firstContact + delimiter + secondContact);
    }
}
