package E07Methods;

        import java.util.Scanner;

public class A06CalculateRectangleArea {

    private static double getArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sideA = Double.parseDouble(scan.nextLine());
        double sideB = Double.parseDouble(scan.nextLine());

        double area= getArea(sideA, sideB);
        System.out.printf("%.0f", area);

    }
}
