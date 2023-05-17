package E03DataTypes;

import java.util.Scanner;

public class E08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);


        int value = (int) char1;

        if (value > 64 && value < 91) {
            System.out.println("upper-case");
        } else if (value > 96 && value < 123) {
            System.out.println("lower-case");
        }
    }
}
