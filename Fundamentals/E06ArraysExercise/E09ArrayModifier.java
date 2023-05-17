package E06ArraysExercise;

import java.util.Scanner;

public class E09ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        String[] command = scan.nextLine().split("\\s+");

        while (!command[0].equals("end")) {

            switch (command[0]) {
                case "swap":
                    int numberOne = numbers[Integer.parseInt(command[1])];
                    int numberTwo = numbers[Integer.parseInt(command[2])];

                    numbers[Integer.parseInt(command[1])] = numberTwo;
                    numbers[Integer.parseInt(command[2])] = numberOne;

                    break;

                case "multiply":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    if (index1 >= 0 && index1 < numbers.length && index2 >= 0 && index2 < numbers.length) {
                        int temp = numbers[index1] * numbers[index2];
                        numbers[index1] = temp;
                    }
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        int temp = numbers[i] - 1;
                        numbers[i] = temp;
                    }

                    break;
            }


            command = scan.nextLine().split("\\s+");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
