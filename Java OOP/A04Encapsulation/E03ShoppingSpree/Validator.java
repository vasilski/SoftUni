package A04Encapsulation.E03ShoppingSpree;

public class Validator {
    public static boolean isValidateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        return true;
    }

    public static boolean isValidateMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        return true;
    }
}
