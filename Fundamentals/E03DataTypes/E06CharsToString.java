package E03DataTypes;

import java.util.Scanner;

public class E06CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        char char3 = scan.nextLine().charAt(0);


        String total  = new String(new char[]{char1, char2, char3});

        System.out.println(total);
    }
}
