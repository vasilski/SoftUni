package E08MethodsExercise;

import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        long factorial1 = calculateFactorial(firstNum);
        long factorial2 = calculateFactorial(secondNum);


        double divisionResult = (double) factorial1 / factorial2;


        System.out.printf("%.2f%n", divisionResult);

    }

    private static long calculateFactorial(int firstNum) {

        long factorial = 1;

        for (int i = 2; i <= firstNum; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
