package E06ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class E07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split("\\s++")).mapToInt(Integer::parseInt).toArray();

        int longestSeqLength = 1;
        int longestSeqStart = 0;
        int currentSeqLength = 1;
        int currentSeqStart = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentSeqLength++;

                if (currentSeqLength > longestSeqLength) {
                    longestSeqLength = currentSeqLength;
                    longestSeqStart = currentSeqStart;
                }
            } else {
                currentSeqLength = 1;
                currentSeqStart = i;
            }
        }

        for (int i = longestSeqStart; i < longestSeqStart + longestSeqLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
