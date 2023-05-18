package E08MethodsExercise;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();
        boolean isValid = validatePassword(password);

        if (isValid) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validatePassword(String password) {
        boolean isValid = true;

        
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            isValid = false;
        }

        if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Password must consist only of letters and digits");
            isValid = false;
        }

        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            System.out.println("Password must have at least 2 digits");
            isValid = false;
        }

        return isValid;
    }
}
