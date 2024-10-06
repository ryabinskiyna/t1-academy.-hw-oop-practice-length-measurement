import java.util.List;

public class Main {
    public static double calculateTotalLength(List<Measurable> measurables) {
        double totalLength = 0;
        for (Measurable measurable : measurables) {
            totalLength += measurable.getLength();
        }
        return totalLength;
    }

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(3, 4);

        PolyLine polyline = new PolyLine(p1, p2, p3);
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(p1, p2, p3);

        List<Measurable> shapes = List.of(polyline, closedPolyLine);

        double totalLength = calculateTotalLength(shapes);
        System.out.println("Общая длина ломаной и замкнутой ломаной: " + totalLength);
    }
}