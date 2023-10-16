package coordinate.domains;

import coordinate.utils.ParsingUtils;

import java.util.List;

public class PointCalculator {
    private Shape shape;

    public PointCalculator(String coordinate){
        this.shape = createShape(_makePoints(coordinate));
    }

    //TODO
    public Shape createShape(List<Point> points) {
        return null;
    }

    public PointCalculator(Shape shape) {
        this.shape = shape;
    }

    private List<Point> _makePoints(String coordinate) {
        return ParsingUtils.convertToPointList(coordinate);
    }

    public double calcDistance() {
        return this.shape.calculateArea();
    }
}
