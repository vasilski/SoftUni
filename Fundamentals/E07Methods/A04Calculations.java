package E07Methods;

import java.util.Scanner;

public class A04Calculations {

    public static void add (int firstNumber, int secondNumber){
        System.out.println(firstNumber + secondNumber);

    }

    public static void multiply (int firstNumber, int secondNumber){
        System.out.println(firstNumber * secondNumber);

    }

    public static void subtract (int firstNumber, int secondNumber){
        System.out.println(firstNumber - secondNumber);

    }

    public static void divide (int firstNumber, int secondNumber){
        System.out.println(firstNumber / secondNumber);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        switch (command) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber, secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber, secondNumber);
                break;
        }
    }
}
