package coordinate.utils;


import coordinate.domains.Point;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CompareUtils {
    // TODO 어떻게 정렬할지
    public static List<Point> sortPointsXY(List<Point> points) {
        Comparator<Point> XComparator = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.getXValue()-p2.getXValue();
            }
        };

        Comparator<Point> YComparator = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                return p1.getYValue()-p2.getYValue();
            }
        };
        return null;

    }
}
