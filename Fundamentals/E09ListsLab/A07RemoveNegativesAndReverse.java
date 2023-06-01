package E09ListsLab;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        if (numbers.size() == 0) {
            System.out.println("empty");
        } else {
            Collections.reverse(numbers);
            for (int j = 0; j <numbers.size() ; j++) {
                System.out.print(numbers.get(j) + " ");
            }
        }
    }
}
