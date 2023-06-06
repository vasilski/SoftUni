package E14ExamPreparation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scan.nextLine());
        int[] liftCabins = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < liftCabins.length; i++) {
            //enter people from queue
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if (peopleInCabin == 4) {
                continue;
            }

            if (freeSpace >= peopleInQueue) {
                liftCabins[i] = liftCabins[i] + peopleInQueue;
                peopleInQueue = 0;
                break;
            }

            liftCabins[i] = 4;
            peopleInQueue = peopleInQueue - freeSpace;

        }

        boolean hasEmptySeats = false;
        for (int peopleInCabin : liftCabins) {
            if (peopleInCabin < 4) {
                hasEmptySeats = true;
                break;
            }
        }
        if (hasEmptySeats) {
            System.out.println("The lift has empty spots!");
        } else if (!hasEmptySeats && peopleInQueue != 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }


        Arrays.stream(liftCabins).forEach(e -> System.out.print(e + " "));
    }
}
