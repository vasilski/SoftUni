package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String num = scan.nextLine();
         int sum = 0;
        for (int i = 0; i <num.length() ; i++) {
            int digit = Character.getNumericValue(num.charAt(i));
            int fact = 1;
            for (int j = 1; j <=digit ; j++) {
                fact = fact * j;
            }
             sum += fact;
        }
        int num2 = Integer.parseInt(num);
        if (sum != num2) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
