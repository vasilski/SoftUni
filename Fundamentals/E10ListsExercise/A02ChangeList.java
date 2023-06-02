package E10ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" +")).map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scan.nextLine().split(" +");

        while (!"end".equals(input[0])) {
            int element = Integer.parseInt(input[1]);
            if ("Delete".equals(input[0])) {
                while (numbers.contains(element)) {
                    int index = numbers.indexOf(element);
                    if (index != -1) {
                        numbers.remove(index);
                    }
                }

            } else if ("Insert".equals(input[0])) {
                int index = Integer.parseInt(input[2]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                }
            }
            input = scan.nextLine().split(" +");
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
