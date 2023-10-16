package coordinate.domains;

import java.util.List;

public class Points {
    private final List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public int getPointsSize() {
        return points.size();
    }

    public double calcDistance() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        return Math.sqrt(Math.pow(p1.getXValue() - p2.getXValue(), 2) + Math.pow(p1.getYValue() - p2.getYValue(), 2));
    }
}
