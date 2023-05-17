package E03DataTypes;

import java.util.Scanner;

public class E07ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);
        char char2 = scan.nextLine().charAt(0);
        char char3 = scan.nextLine().charAt(0);


        String total  = new String(new char[]{char3, ' ', char2, ' ', char1});

        System.out.println(total);
    }
}
