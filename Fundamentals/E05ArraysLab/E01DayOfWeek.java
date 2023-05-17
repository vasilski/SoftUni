package E05ArraysLab;

import java.util.Scanner;

public class E01DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (num > 0 && num <= 7) {
            System.out.println(day[num - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
