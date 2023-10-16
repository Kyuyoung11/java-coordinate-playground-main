package coordinate.domains;

import coordinate.utils.ParsingUtils;

import java.util.List;

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
        return points.calcDistance();
    }
}
