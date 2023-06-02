package E10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A06CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty()) {

            int cardFirstPlayer = firstPlayer.get(0);
            int cardSecondPlayer = secondPlayer.get(0);

            if (cardFirstPlayer > cardSecondPlayer) {
                firstPlayer.add(cardFirstPlayer);
                firstPlayer.add(cardSecondPlayer);
                firstPlayer.remove(0);
                secondPlayer.remove(0);

            } else if (cardFirstPlayer < cardSecondPlayer) {
                secondPlayer.add(cardSecondPlayer);
                secondPlayer.add(cardFirstPlayer);
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            } else {
                firstPlayer.remove(0);
                secondPlayer.remove(0);
            }
        }

        if (secondPlayer.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", sumPoint(firstPlayer));
        } else if (firstPlayer.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d", sumPoint(secondPlayer));
        }
    }


    private static int sumPoint(List<Integer> cards) {
        int totalPoint = 0;
        for (Integer card : cards) {
            totalPoint += card;
        }
        return totalPoint;
    }
}
