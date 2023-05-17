package E07Methods;

import java.util.Scanner;

public class A10MultiplyEvensByOdds {

    public static int getMultipleOfEvensAndOdds(String[] firstLine) {
        int[] firsNumbers = new int[firstLine.length];
        for (int i = 0; i < firstLine.length; i++) {
            firsNumbers[i] = Integer.parseInt(firstLine[i]);
        }
        int even = 0;
        int odd = 0;

        for (int i = 0; i < firsNumbers.length; i++) {
            int firsNumber = firsNumbers[i];
            if (firsNumber % 2 != 0) {
                odd += firsNumber;
            }else {
                even +=firsNumber;
            }
        }

        int total = even * odd;
        return total;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().replace("-","").split("");

        System.out.println(Math.abs(getMultipleOfEvensAndOdds(firstLine)));
    }
}
