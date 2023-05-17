package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E10RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice  = Double.parseDouble(scan.nextLine());
        double mousePrice  = Double.parseDouble(scan.nextLine());
        double keyboardPrice  = Double.parseDouble(scan.nextLine());
        double displayPrice  = Double.parseDouble(scan.nextLine());
        int headsetTrash = 0;
        int mousePTrash = 0;
        int keyboardTrash = 0;
        int displayTrash = 0;

        if (lostGames >= 2) {
            headsetTrash = lostGames / 2;
        }
        if (lostGames >= 3) {
            mousePTrash = lostGames / 3;
        }
        if (lostGames >= 6) {
            keyboardTrash = lostGames / 6;
        }
        if (lostGames >= 12) {
            displayTrash = lostGames / 12;
        }
        double totalDemage = (headsetPrice * headsetTrash) + (mousePrice * mousePTrash) + (keyboardPrice * keyboardTrash) + (displayPrice * displayTrash);

        System.out.printf("Rage expenses: %.2f lv.",totalDemage);
    }
}
