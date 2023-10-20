package coordinate.domains;

import coordinate.utils.ValidationUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Rectangle implements Shape{
    private final int SIZE = 4;
    private final List<Point> points;
    private final int height;
    private final int width;

    public Rectangle(List<Point> points) {
        _validate(points);
        this.points = points;
        this.height = 0;
        this.width = 0;
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
