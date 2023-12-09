package A14DefiningClassesExercises.E01OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());

        List<Person> personList = new ArrayList<>();

        while (lines-- > 0) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            if (person.getAge() > 30) {
                personList.add(person);
            }
        }
        personList.sort(Comparator.comparing(Person::getName));

        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
