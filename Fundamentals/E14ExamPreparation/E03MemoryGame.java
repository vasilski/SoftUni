package E14ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> sequence = Arrays.stream(scan.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scan.nextLine();
        int counter = 0;

        while (!input.equals("end")) {
            counter++;
            int[] inputArr = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int firstIndex = inputArr[0];
            int secondIndex = inputArr[1];

            if (userIsCheating(firstIndex, secondIndex, sequence)) {
                System.out.println("Invalid input! Adding additional elements to the board");
                String penaltyNumber = String.format("-%da", counter);
                sequence.add(sequence.size() / 2, penaltyNumber);
                sequence.add(sequence.size() / 2, penaltyNumber);
                input = scan.nextLine();
                continue;
            }

            String firstNumber = sequence.get(firstIndex);
            String secondNumber = sequence.get(secondIndex);

            if (firstNumber.equals(secondNumber)) {
                sequence.remove(firstNumber);
                sequence.remove(secondNumber);
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstNumber);
            } else {
                System.out.println("Try again!");
            }

            if (sequence.isEmpty()) {
                break;
            }

            input = scan.nextLine();
        }

        if (sequence.isEmpty()) {
            System.out.printf("You have won in %d turns!", counter);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", sequence));
        }
    }

    private static boolean userIsCheating(int firstIndex, int secondIndex, List<String> sequence) {
        if (firstIndex == secondIndex) {
            return true;
        }
        if (firstIndex < 0 || firstIndex >= sequence.size()) {
            return true;
        }
        if (secondIndex < 0 || secondIndex >= sequence.size()) {
            return true;
        }

        return false;
    }
}