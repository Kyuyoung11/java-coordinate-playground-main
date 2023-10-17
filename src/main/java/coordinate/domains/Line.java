package coordinate.domains;

import coordinate.utils.CalculationUtils;
import coordinate.utils.ValidationUtils;

import java.util.List;

public class Line implements Shape {
    private final int SIZE = 2;
    private final List<Point> points;

    public Line(List<Point> points) {
        _validate(points);
        this.points = points;
    }

    private void _validate(List<Point> points) {
        ValidationUtils.validateSize(points.size(), SIZE);
    }

    @Override
    public double calculateArea() {
        return CalculationUtils.calculateDistance(points.get(0), points.get(1));
    }
}
