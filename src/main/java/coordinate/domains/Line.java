package coordinate.domains;

import java.util.List;

public class Line implements Shape {
    private final int SIZE = 2;
    private final List<Point> points;

    public Line(List<Point> points) {
        _validate(points);
        this.points = points;
    }

    private void _validate(List<Point> points) {
        if (points.size() != SIZE) {
            throw new IllegalArgumentException("점의 개수가 올바르지 않습니다.");
        }
    }

    @Override
    public double calculateArea() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        return Math.sqrt(Math.pow(p1.getXValue() - p2.getXValue(), 2) + Math.pow(p1.getYValue() - p2.getYValue(), 2));
    }
}
