package A15Workshop.E02SmartStack;

public class Main {
    public static void main(String[] args) {
        SmartStack stack = new SmartStack();

        stack.push(13);
        stack.push(42);
        stack.push(69);

//        System.out.println(stack.peek());

//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }

        stack.forEach(System.out::println);

        System.out.println();
    }
}
