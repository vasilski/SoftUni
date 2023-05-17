package E06ArraysExercise;

import java.util.Scanner;

public class E04ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");
        int rotation = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotation; i++) {
            String swap = line[0];
            for (int k = 0; k <line.length -1 ; k++) {
                line[k] = line[k + 1];
            }
            line[line.length - 1] = swap;
        }
        System.out.println(String.join(" ", line));
    }
}
