package A04StacksAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        scan.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] numbers = scan.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            String number = numbers[i];
            stack.push(Integer.parseInt(number));
        }
        for (int k = 1; k <= s; k++) {
            stack.pop();
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            } else {
                System.out.println(0);
            }
        }
    }
}
