package E10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A01Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity = Integer.parseInt(scan.nextLine());
        String[] input = scan.nextLine().split(" ");

        while (!"end".equals(input[0])) {
            if (input[0].equals("Add")) {
                numbers.add(Integer.parseInt(input[1]));
            } else {
                int passengers = Integer.parseInt(input[0]);
                for (int i = 0; i < numbers.size(); i++) {
                    int current = numbers.get(i);
                    int pass = current + passengers;
                    if (pass <= capacity) {
                        numbers.set(i, pass);
                        break;
                }
                }
            }
            input = scan.nextLine().split(" ");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
