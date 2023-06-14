package E16AssociativeArraysEx;

import java.util.*;

public class E06StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        while (num-- > 0) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        students.entrySet()
                        .stream()
                        //.sorted()
                                .forEach(entry ->{
                                    double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).sum() / entry.getValue().size();
                                    System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
                                });

        //System.out.println();
    }

}
