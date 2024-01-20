package A01Abstraction.E01RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        System.out.println(getTriangleOfStars(num, true));
        System.out.println(getTriangleOfStars(num, false));


    }

    public static String getTriangleOfStars(int num, boolean isUpwardsOrientated) {
        StringBuilder out = new StringBuilder();
        for (int row = 1; row <= num; row++) {
            int spacesCount = isUpwardsOrientated ? num - row : row;
            int starsCount = isUpwardsOrientated ? row : num - row;
            out.append(repeatString(spacesCount, " "));
            out.append(repeatString(starsCount, "* "));
            if (row != num) {
                out.append(System.lineSeparator());
            }
        }
        return out.toString();
    }

    public static String repeatString(int count, String toRepeat) {
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < count; i++) {
            out.append(toRepeat);
        }
        return out.toString();
    }
}
