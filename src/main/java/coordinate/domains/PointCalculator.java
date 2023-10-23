package coordinate.domains;

import coordinate.utils.ParsingUtils;
import coordinate.view.OutputView;

import java.util.List;

public class PointCalculator {
    private Shape shape;


    //TODO _printCoordinate 어디에 넣어야할지 고민
    public PointCalculator(List<Point> points){
        ShapeFactory shapeFactory = new ShapeFactory();
        this.shape = shapeFactory.newInstance(points);
        _printCoordinate(points);
    }

    private void _printCoordinate(List<Point> pointList) {
        OutputView.printCoordinate(pointList);
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

    public void printArea() {
        this.shape.printArea();
    }

    public Shape getShape() {
        return this.shape;
    }
}
