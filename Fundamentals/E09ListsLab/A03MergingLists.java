package E09ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firsList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int maxSize = Math.max(firsList.size(), secondList.size());

        List<Integer> merged = new ArrayList<>();

        for (int i = 0; i <=maxSize ; i++) {
            if (i < firsList.size()) {
                merged.add(firsList.get(i));
            }
            if (i < secondList.size()) {
                merged.add(secondList.get(i));
            }

        }
        for (int num : merged)
        System.out.print(num + " ");
    }
}
