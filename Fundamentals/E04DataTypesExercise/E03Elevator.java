package E04DataTypesExercise;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int person = Integer.parseInt(scan.nextLine());
        int capacity = Integer.parseInt(scan.nextLine());

        int courses = (int) Math.ceil((double) person / capacity);

        System.out.println(courses);
    }
}
