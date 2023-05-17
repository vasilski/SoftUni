package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int totalSum = 0;

        for (int i = num1; i <= num2; i++) {
            totalSum += i;
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.printf("Sum: %d",totalSum);
    }
}