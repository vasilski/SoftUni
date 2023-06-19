package A01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> deque = new ArrayDeque<>();

        String input = scan.nextLine();

        while (!"Home".equalsIgnoreCase(input)) {

            if ("Back".equalsIgnoreCase(input)) {
                if (stack.size() > 1) {
                    deque.offer(stack.pop());
                    System.out.println(stack.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            } else if ("forward".equalsIgnoreCase(input)) {
                if (deque.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    stack.push(deque.peek());
                    System.out.println(deque.poll());
                }
            } else {
                stack.push(input);
                System.out.println(input);
            }
            input = scan.nextLine();
        }
    }
}

