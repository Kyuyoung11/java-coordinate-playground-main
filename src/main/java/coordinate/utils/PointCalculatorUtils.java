package coordinate.utils;

import coordinate.domains.Point;

public class PointCalculatorUtils {
    public static double calcDistance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getXValue()-p2.getXValue(),2) + Math.pow(p1.getYValue()-p2.getYValue(),2));
    }
}
