package E05ArraysLab;

import java.util.Scanner;

public class E02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        String[] stringNumbers = new String[num];
        int[] array = new int[stringNumbers.length];

        for (int k = 0; k < array.length; k++){
            array[k] = scan.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {

            System.out.printf("%d ", array[i]);
        }
    }
}
