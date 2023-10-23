package coordinate.view;

import coordinate.domains.Point;
import coordinate.domains.PointCalculator;
import coordinate.domains.Shape;

import java.util.Arrays;
import java.util.List;

public class OutputView {

    private static final int MAX_VALUE = 24;
    public static void printArea(PointCalculator pointCalculator) {
        pointCalculator.printArea();
    }

    public static void printCoordinate(List<Point> points) {
        String[] coordinate = _initCoordinate(points);

        for (String column : coordinate) {
            System.out.println(column);
        }

        System.out.println();
    }

    private static String[] _initCoordinate(List<Point> points) {
        String[] coordinate = new String[MAX_VALUE+2];

        coordinate[0]  = "24|                                                                      ";
        coordinate[1]  = "  |                                                                      ";
        coordinate[2]  = "22|                                                                      ";
        coordinate[3]  = "  |                                                                      ";
        coordinate[4]  = "20|                                                                      ";
        coordinate[5]  = "  |                                                                      ";
        coordinate[6]  = "18|                                                                      ";
        coordinate[7]  = "  |                                                                      ";
        coordinate[8]  = "16|                                                                      ";
        coordinate[9]  = "  |                                                                      ";
        coordinate[10] = "14|                                                                      ";
        coordinate[11] = "  |                                                                      ";
        coordinate[12] = "12|                                                                      ";
        coordinate[13] = "  |                                                                      ";
        coordinate[14] = "10|                                                                      ";
        coordinate[15] = "  |                                                                      ";
        coordinate[16] = " 8|                                                                      ";
        coordinate[17] = "  |                                                                      ";
        coordinate[18] = " 6|                                                                      ";
        coordinate[19] = "  |                                                                      ";
        coordinate[20] = " 4|                                                                      ";
        coordinate[21] = "  |                                                                      ";
        coordinate[22] = " 2|                                                                      ";
        coordinate[23] = "  |                                                                      ";
        coordinate[24] = "  +----------------------------------------------------------------------";
        coordinate[25] = " 0    2     4     6     8    10    12    14    16    18    20    22    24";


        for (Point point : points) {
            int y = MAX_VALUE-point.getYValue();
            int x = point.getXValue()*3;
            coordinate[y] = coordinate[y].substring(0, x) + "●" + coordinate[y].substring(x+1);
        }
        return coordinate;
    }

    private static String _getCoordinateChar(int i) {
        if (i%2==0) {
            return Integer.toString(i);
        }
        return "  ";
    }
}
