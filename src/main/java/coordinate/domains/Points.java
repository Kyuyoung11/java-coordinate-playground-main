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
}
