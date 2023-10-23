package coordinate.domains;

import coordinate.utils.SortingUtils;
import coordinate.utils.ValidationUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle implements Shape{
    private final int SIZE = 4;
    private final int UNIQUE_VALUE_SIZE = 2;
    private final List<Point> points;

    public Rectangle(List<Point> points) {
        _validate(points);
        this.points = points;
    }



    private void _validate(List<Point> points) {
        //1. SIZE
        ValidationUtils.validateSize(points.size(), SIZE);

        //2. 직사각형맞는지
        _validateRectangle(points);

    }

    private void _validateRectangle(List<Point> points) {

        Set<Integer> xValues = _makeUniqueXValues(points);
        Set<Integer> yValues = _makeUniqueYValues(points);

        if(_isNotUniqueValueSize(xValues.size()) || _isNotUniqueValueSize(yValues.size())) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }

    }

    private boolean _isNotUniqueValueSize(int size) {
        return size != UNIQUE_VALUE_SIZE;
    }

    private Set<Integer> _makeUniqueXValues(List<Point> points) {
        return points.stream()
                .map(Point::getXValue)
                .collect(Collectors.toSet());
    }

    private Set<Integer> _makeUniqueYValues(List<Point> points) {
        return points.stream()
                .map(Point::getYValue)
                .collect(Collectors.toSet());
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
