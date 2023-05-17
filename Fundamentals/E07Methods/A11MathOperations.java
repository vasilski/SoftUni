package E07Methods;

import java.util.Scanner;

public class A11MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        char operator = scan.next().charAt(0);
        scan.nextLine();
        int secondNum = Integer.parseInt(scan.nextLine());

        calculate(firstNum, operator, secondNum);
    }

    private static void calculate(int firstNum, char operator, int secondNum) {

       double result = 0;

       switch (operator) {
           case '+':
               result = firstNum + secondNum;
               break;
           case '-':
               result = firstNum - secondNum;
               break;
           case '/':
               result = firstNum / secondNum;
               break;
           case '*':
               result = firstNum * secondNum;
               break;
       }

        System.out.printf("%.0f", result);
    }
}
