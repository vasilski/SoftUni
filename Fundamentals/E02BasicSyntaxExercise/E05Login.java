package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String pass = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            pass += name.charAt(i);
        }
        int passCounter = 0;
        String correctPassword = scan.nextLine();
        while (!(correctPassword.equals(pass))) {
            passCounter++;
            if (passCounter == 4 ){
                System.out.printf("User %s blocked!", name);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            correctPassword = scan.nextLine();
        }
        System.out.printf("User %s logged in.", name);
    }
}
