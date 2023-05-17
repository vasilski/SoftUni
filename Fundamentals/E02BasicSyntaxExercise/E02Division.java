package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E02Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        if (num % 10 == 0){
            System.out.printf("The number is divisible by %d", 10);
        } else if (num % 7 == 0) {
            System.out.printf("The number is divisible by %d", 7);
        } else if (num % 6 == 0) {
            System.out.printf("The number is divisible by %d", 6);
        } else if (num % 3 == 0) {
            System.out.printf("The number is divisible by %d", 3);
        }else if (num % 2 == 0) {
            System.out.printf("The number is divisible by %d", 2);
        } else {
            System.out.println("Not divisible");
        }
    }
}
