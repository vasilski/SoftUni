package E06ArraysExercise;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (String secondWord : second) {
            for (String firsWord : first) {
                if (secondWord.equals(firsWord)) {
                    System.out.print(secondWord + " ");
                }
            }
        }
    }
}
