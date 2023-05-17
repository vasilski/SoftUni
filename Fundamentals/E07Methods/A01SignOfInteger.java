package E07Methods;

        import java.util.Scanner;

public class A01SignOfInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        positive(num);
        negative(num);
        zero(num);
    }

    private static void positive(int num) {
        if (num > 0) {
            System.out.printf("The number %d is positive.", num);
        }
    }
    private static void negative(int num) {
        if (num < 0) {
            System.out.printf("The number %d is negative.", num);
        }
    }
        private static void zero(int num) {
        if (num == 0) {
            System.out.printf("The number %d is zero.", num);
        }
    }

}
