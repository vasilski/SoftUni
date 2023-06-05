package E13ObjectsAndClasses.opinion_poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scan.nextLine().split(" ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        people.stream().sorted((p1, p2)-> p1.getName().compareTo(p2.getName()))
                .forEach(e-> System.out.println(e));
    }
}
