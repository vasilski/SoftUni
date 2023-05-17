package A01BasicSyntax;

import java.util.Scanner;

public class E04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        int totalTime = hour * 60 + minutes + 30;
        int hoursNew = totalTime / 60;
        int minutesNew = totalTime % 60;

        if (hoursNew >= 24) {
            hoursNew -= 24;
        }
        System.out.printf("%d:%02d", hoursNew, minutesNew);
    }
}
