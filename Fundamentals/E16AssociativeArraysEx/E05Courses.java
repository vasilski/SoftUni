package E16AssociativeArraysEx;

import java.util.*;

public class E05Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        LinkedHashMap<String, List<String>> coursesSet = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String course = input.split(" : ")[0];
            String name = input.split(" : ")[1];

            if (!coursesSet.containsKey(course)) {
                coursesSet.put(course, new ArrayList<>());
            }
            coursesSet.get(course).add(name);


            input = scan.nextLine();
        }

        coursesSet.entrySet()
                .stream()
               // .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().stream()
                           // .sorted()
                            .forEach(studentName -> System.out.println("-- " + studentName));
                });

    }
}
