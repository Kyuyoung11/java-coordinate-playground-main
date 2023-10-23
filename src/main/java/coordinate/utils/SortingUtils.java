package coordinate.utils;


import coordinate.domains.Point;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUtils {

    public static List<Point> sortPointsXY(List<Point> points) {
        return points.stream()
                .sorted(Comparator.comparingInt(Point::getYValue))
                .sorted(Comparator.comparingInt(Point::getXValue))
                .collect(Collectors.toList());
    }
}
