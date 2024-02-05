package A03Encapsulation.E04FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Team team = new Team("Black Eagles");

        while (n-- > 0) {
            String[] token = scan.nextLine().split("\\s+");
            String firstName = token[0];
            String lastName = token[1];
            int age = Integer.parseInt(token[2]);
            double salary = Double.parseDouble(token[3]);

            Person person = new Person(firstName, lastName, age, salary);

            team.addPlayer(person);
        }

        System.out.println(team.getFirstTeam().size());
        System.out.println(team.getReserveTeam().size());
    }
}
