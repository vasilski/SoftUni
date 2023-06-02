package E10ListsExercise;

import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A03HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        int count = Integer.parseInt(scan.nextLine());

        while (count-- > 0) {
            String command = scan.nextLine();
            String[] input = command.split(" +");
            String name = input[0];

            if ((command).contains("is going!")) {
                if (names.contains(name)){
                    System.out.println(name + " is already in the list!");
                } else {
                    names.add(name);
                }
            } else {
                if (names.contains(name)){
                    names.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
