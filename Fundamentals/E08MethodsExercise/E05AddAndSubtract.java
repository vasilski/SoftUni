package E08MethodsExercise;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());


        int result = sum(first, second);
        int finalResult = subtract(result, third);

        System.out.println(finalResult);
    }

    private static int sum(int first, int second) {
        int sum = first + second;
        return sum;
    }

    private static int subtract(int result, int third) {
        int subs = result - third;
        return subs;
    }
}
