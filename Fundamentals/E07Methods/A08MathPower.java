package E07Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A08MathPower {

    private static double powerMath (double firstNUm, double secondNum) {
        double sum = Math.pow(firstNUm, secondNum);

        return sum;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double firstNum = Double.parseDouble(scan.nextLine());
        double secondNum = Double.parseDouble(scan.nextLine());

        System.out.println(new DecimalFormat("0.####").format(powerMath(firstNum, secondNum)));
    }
}
