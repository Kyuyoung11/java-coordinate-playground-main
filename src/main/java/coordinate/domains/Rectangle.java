package coordinate.domains;

import coordinate.utils.ValidationUtils;

import java.util.List;

public class Rectangle implements Shape{
    private final int SIZE = 4;
    private final List<Point> points;

    public Rectangle(List<Point> points) {
        _validate(points);
        this.points = points;
    }

    private void _validate(List<Point> points) {
        //1. SIZE
        ValidationUtils.validateSize(points.size(), SIZE);

        //2. TODO 직사각형맞는지
        _validateRectangle(points);

    }

    private void _validateRectangle(List<Point> points) {

    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
