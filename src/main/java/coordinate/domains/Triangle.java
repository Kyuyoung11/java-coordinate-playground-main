package coordinate.domains;

import java.util.List;

public class Triangle implements Shape{
    private final List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public double calculateArea() {
        return (double) Math.abs(((points.get(0).getXValue() * points.get(1).getYValue())
                + (points.get(1).getXValue() * points.get(2).getYValue())
                + (points.get(2).getXValue() * points.get(0).getYValue()))
                - ((points.get(1).getXValue() * points.get(0).getYValue())
                + (points.get(2).getXValue() * points.get(1).getYValue())
                + (points.get(0).getXValue() * points.get(2).getYValue())))
                / 2;
    }

    @Override
    public void printArea() {
        System.out.println("삼각형 넓이는 " + calculateArea());
    }
}
