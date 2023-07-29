package A07SetAndMapAdvanceLab;

import java.util.*;

public class E08AcademyGraduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, double[]> studentsGrades = new TreeMap<>();

        while (n-- > 0) {
            String name = scan.nextLine();
            double[] grades = Arrays.stream(scan.nextLine()
                            .split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            studentsGrades.put(name, grades);
        }
        studentsGrades.forEach((k, v) -> {
            System.out.printf("%s is graduated with %f%n", k,
                    Arrays.stream(v).average().orElse(0));
        });
    }
}
