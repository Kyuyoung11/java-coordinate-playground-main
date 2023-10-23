package coordinate.domains;

import coordinate.utils.ValidationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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


    /**
     * TODO 고민 내용
     * 1. Map<Integer, Long>를 멤버변수로 올려도 되는건지
     * 2. 메소드만 다르고 로직순서는 같은데 이건 리팩토링 못하는건지
     * @param points
     */
    private void _validateRectangle(List<Point> points) {

        Map<Integer, Long> xValueCount = _countXValue(points);
        Map<Integer, Long> yValueCount = _countYValue(points);
        _validateSize(xValueCount);
        _validateSize(yValueCount);

    }

    private void _validateSize(Map<Integer, Long> valueCount) {
        _throwIsNotCountSize(valueCount.keySet().size());
        valueCount.forEach((key,value) -> _throwIsNotCountSize(value.intValue()));
    }

    private void _throwIsNotCountSize(int size) {
        if (size != UNIQUE_VALUE_SIZE) {
            throw new IllegalArgumentException("직사각형이 아닙니다.");
        }
    }

    private Map<Integer, Long> _countXValue(List<Point> points) {
        return points.stream()
                .collect(Collectors.groupingBy(Point::getXValue, Collectors.counting()));
    }

    private Map<Integer, Long> _countYValue(List<Point> points) {
        return points.stream()
                .collect(Collectors.groupingBy(Point::getYValue, Collectors.counting()));
    }

    @Override
    public double calculateArea() {
        int width = _calculateWidth(points);
        int height = _calculateHeight(points);
        return width * height;
    }



    private int _calculateWidth(List<Point> points) {
        ArrayList<Integer> xValues = new ArrayList<>(_countXValue(points).keySet());
        return Math.abs(xValues.get(0)-xValues.get(1));
    }

    private int _calculateHeight(List<Point> points) {
        ArrayList<Integer> yValues = new ArrayList<>(_countYValue(points).keySet());
        return Math.abs(yValues.get(0)-yValues.get(1));
    }

    @Override
    public void printArea() {
        System.out.println("사각형 넓이는 "+ (int)calculateArea());
    }
}
