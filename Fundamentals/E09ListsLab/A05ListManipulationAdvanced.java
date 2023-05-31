package E09ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scan.nextLine().split(" ");

        while (!("end".equals(command[0]))) {

            switch (command[0]) {
                case "Contains":
                    if (numbers.contains(Integer.valueOf(command[1]))) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (command[1]) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 0) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) % 2 == 1) {
                                    System.out.print(numbers.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum = 0;
                    switch (command[1]) {
                        case "sum":
                            for (int i = 0; i < numbers.size(); i++) {
                                sum += numbers.get(i);
                            }
                            System.out.println(sum);
                            break;
                    }
                    break;
                case "Filter":
                    switch (command[1]) {
                        case ">=":
                            for (int i = 0; i <numbers.size() ; i++) {
                                int firstNum = Integer.parseInt(command[2]);
                                int secondNum = numbers.get(i);
                                if (secondNum >= firstNum) {
                                    System.out.printf("%d ",secondNum);
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i <numbers.size() ; i++) {
                                int firstNum = Integer.parseInt(command[2]);
                                int secondNum = numbers.get(i);
                                if (secondNum <= firstNum) {
                                    System.out.printf("%d ",secondNum);
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i <numbers.size() ; i++) {
                                int firstNum = Integer.parseInt(command[2]);
                                int secondNum = numbers.get(i);
                                if (secondNum > firstNum) {
                                    System.out.printf("%d ",secondNum);
                                }
                            }
                            System.out.println();
                            break;
                        case "<":
                            for (int i = 0; i <numbers.size() ; i++) {
                                int firstNum = Integer.parseInt(command[2]);
                                int secondNum = numbers.get(i);
                                if (secondNum < firstNum) {
                                    System.out.printf("%d ",secondNum);
                                }
                            }
                            System.out.println();
                            break;
                    }
                     break;
            }
            command = scan.nextLine().split(" ");
        }
    }
}
