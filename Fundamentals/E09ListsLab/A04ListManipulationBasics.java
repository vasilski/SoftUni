package E09ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers =  Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");


        while (!("end".equals(command[0]))) {

            switch (command[0]) {
                case "Add" :
                    numbers.add(Integer.valueOf(command[1]));
                    break;
                case "Remove":
                    numbers.remove((Integer.valueOf(command[1])));
                    break;
                case "RemoveAt":
                    numbers.remove(Integer.parseInt(command[1]));
                    break;
                case "Insert":
                    numbers.add(Integer.parseInt(command[2]), Integer.parseInt(command[1]));
                    break;

        }
            command = scan.nextLine().split(" ");
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
