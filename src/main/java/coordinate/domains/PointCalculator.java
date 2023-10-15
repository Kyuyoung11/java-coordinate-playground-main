package coordinate.domains;

import coordinate.utils.ParsingUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PointCalculator {
    private Points points;

    public PointCalculator(String coordinate){
        this.points = new Points(_makePoints(coordinate));
    }

    public PointCalculator(Points points) {
        this.points = points;
    }

    private List<Point> _makePoints(String coordinate) {
        return ParsingUtils.convertToPointList(coordinate);
    }

    public double calcDistance() {
        return 0;
//        if (this.points.getPointsSize() == 2) {
//            return Math.sqrt(Math.pow(p1.getXValue() - p2.getXValue(), 2) + Math.pow(p1.getYValue() - p2.getYValue(), 2));
//        }
    }
}
