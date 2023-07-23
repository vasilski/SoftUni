package A06MiltidimensionalArrayEx;

import java.util.Arrays;
import java.util.Scanner;

public class E09ParkingSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] data = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();


        boolean[][] parking = new boolean[data[0]][data[1]];

        for (int i = 0; i < parking.length; i++) {
            parking[i][0] = true;
        }

        String input = scan.nextLine();
        while (!"stop".equals(input)) {
            String[] tokens = input.split("\\s+");

            int entryRow = Integer.parseInt(tokens[0]);
            int targetRow = Integer.parseInt(tokens[1]);
            int targetCol = Integer.parseInt(tokens[2]);
            boolean hasFoundFreePlace = false;

            int traveledDistance = 1;
            traveledDistance += Math.abs(targetRow - entryRow);

            if (!parking[targetRow][targetCol]) {
                traveledDistance += targetCol;
                parking[targetRow][targetCol] = true;
                hasFoundFreePlace = true;
            } else {
                for (int i = 1; i < parking[targetRow].length; i++) {
                    if (targetCol - i > 0 && !parking[targetRow][targetCol - i]) {
                        parking[targetRow][targetCol - i] = true;
                        hasFoundFreePlace = true;
                        traveledDistance += targetCol - i;
                        break;
                    }

                    if (targetCol + i < parking[targetRow].length && !parking[targetRow][targetCol + i]) {
                        parking[targetRow][targetCol + i] = true;
                        hasFoundFreePlace = true;
                        traveledDistance += targetCol + i;
                        break;
                    }
                }
            }

            if (hasFoundFreePlace) {
                System.out.println(traveledDistance);
            } else {
                System.out.println(String.format("Row %d full", targetRow));
            }
            input = scan.nextLine();
        }


    }
}
