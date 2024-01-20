package A01WorkingWithAbstraction.E02PointINRectangleV2;

import A01WorkingWithAbstraction.E02PointINRectangleV2.IOUtils.ConsoleReader;
import A01WorkingWithAbstraction.E02PointINRectangleV2.IOUtils.InputParser;
import A01WorkingWithAbstraction.E02PointINRectangleV2.geometry.GeometryFactory;
import A01WorkingWithAbstraction.E02PointINRectangleV2.geometry.Point2D;
import A01WorkingWithAbstraction.E02PointINRectangleV2.geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        ConsoleReader reader = new ConsoleReader();
        int[] rectangleInfo = InputParser.parseArray(reader.readLine(), "\\s");

        Rectangle rectangle = GeometryFactory.createRectangle(rectangleInfo);

        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            int [] pointInfo =
                    InputParser.parseArray(reader.readLine(), "\\s+");

            Point2D point2D = GeometryFactory.createPoint2D(pointInfo);

            System.out.println(rectangle.contains(point2D));
        }
    }
}
