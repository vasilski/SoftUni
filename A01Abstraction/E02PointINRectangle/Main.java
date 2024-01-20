package A01WorkingWithAbstraction.E02PointINRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Point bottomLeft = createPointReadingsTwoIntsFrom(scan);
        Point topRight = createPointReadingsTwoIntsFrom(scan);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int numberOfPoints = scan.nextInt();
        for (int i = 0; i < numberOfPoints; i++) {

            Point point = createPointReadingsTwoIntsFrom(scan);

            System.out.println(rectangle.contains(point));
        }
    }

    private static Point createPointReadingsTwoIntsFrom(Scanner scan) {
        int pointX = scan.nextInt();
        int pointY = scan.nextInt();

        return new Point(pointX, pointY);
    }
}
