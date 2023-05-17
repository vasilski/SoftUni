package E05ArraysLab;

import java.util.Scanner;

public class E06EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstLine = scan.nextLine().split(" ");
        String[] secondLine = scan.nextLine().split(" ");

        int[] firsNumbers = new int[firstLine.length];
        int[] secondNumbers = new int[secondLine.length];

        for (int i = 0; i < firstLine.length; i++) {
            firsNumbers[i] = Integer.parseInt(firstLine[i]);
        }

        for (int i = 0; i < secondLine.length; i++) {
            secondNumbers[i] = Integer.parseInt(secondLine[i]);
        }
        int sum = 0;
        boolean isFalse = false;
        for (int i = 0; i < firsNumbers.length; i++) {
            if (firsNumbers[i] == secondNumbers[i]) {
                sum += firsNumbers[i];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
            if (i == firsNumbers.length-1) {
                isFalse = true;
            }
        }
        while (isFalse) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
            break;
        }
    }
}
