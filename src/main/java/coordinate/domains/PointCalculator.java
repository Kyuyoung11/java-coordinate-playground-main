package coordinate.domains;

import coordinate.utils.ParsingUtils;

import java.util.List;

public class PointCalculator {
    private Shape shape;

    public PointCalculator(String coordinate){
        ShapeFactory shapeFactory = new ShapeFactory();
        this.shape = shapeFactory.newInstance(_makePoints(coordinate));
    }

    public PointCalculator(List<Point> points){
        ShapeFactory shapeFactory = new ShapeFactory();
        this.shape = shapeFactory.newInstance(points);
    }

    public PointCalculator(Shape shape) {
        this.shape = shape;
    }

    private List<Point> _makePoints(String coordinate) {
        return ParsingUtils.convertToPointList(coordinate);
    }

    public double calculateArea() {
        return this.shape.calculateArea();
    }
}
