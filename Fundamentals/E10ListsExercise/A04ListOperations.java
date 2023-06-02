package E10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scan.nextLine();

        while (!("End").equalsIgnoreCase(input)) {
            String[] command = input.split(" +");
            switch (command[0]) {
                case "Add":
                    numbers.add(Integer.parseInt(command[1]));
                    break;
                case "Insert": {
                    int index = Integer.parseInt(command[2]);
                    if (index > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        int element = Integer.parseInt(command[1]);
                        numbers.add(index, element);
                    }
                    break;
                }
                case "Remove": {
                    int index = Integer.parseInt(command[1]);
                    if (index > numbers.size()) {
                        System.out.println("Invalid index");
                    } else {
                        numbers.remove(index);
                    }
                    break;
                }
                    case "Shift": {
                        int count = Integer.parseInt(command[2]);
                        if (command[1].equals("left")) {
                            for (int i = 0; i < count; i++) {
                                numbers.add(numbers.get(0));
                                numbers.remove(0);
                            }
                        } else {

                            for (int j = 0; j < count; j++) {
                                numbers.add(0, numbers.get(numbers.size() - 1));
                                numbers.remove(numbers.size() - 1);
                            }
                        }
                        break;
                    }
            }
            input = scan.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}