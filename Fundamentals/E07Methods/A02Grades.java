package E07Methods;

import java.util.Scanner;

public class A02Grades {

    public static void fail(double input){
        if (input >= 2.00 && input <= 2.99){
            System.out.println("Fail");
        }
    }
    public static void poor(double input){
        if (input >= 3.00 && input <= 3.49){
            System.out.println("Poor");
        }
    }
    public static void good(double input){
        if (input >= 3.50 && input <= 4.49){
            System.out.println("Good");
        }
    }
    public static void veryGood(double input){
        if (input >= 4.50 && input <= 5.49){
            System.out.println("Very good");
        }
    }
    public static void excellent(double input){
        if (input >= 5.50 && input <= 6.00){
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());

        fail(input);
        poor(input);
        good(input);
        veryGood(input);
        excellent(input);
    }
}
