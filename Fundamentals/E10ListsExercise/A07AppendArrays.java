package E10ListsExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A07AppendArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<String> list = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(list);

        System.out.println(list.toString().replace("[", "")
                                            .replace("]", "")
                                             .replace(",", "")
                                                .replaceAll("\\s+", " ")
                                                .trim());
    }
}
