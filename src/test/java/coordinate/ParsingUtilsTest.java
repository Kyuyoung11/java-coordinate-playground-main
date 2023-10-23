package coordinate;

import coordinate.domains.Point;
import coordinate.utils.ParsingUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParsingUtilsTest {
    @Test
    void convertToPoint() {
        Point p = ParsingUtils.convertToPoint("(10,11)");
        assertTrue(p.isEqualsXY(10,11));

    }


    @Test
    void convertToPointList() {
        List<Point> pointList = ParsingUtils.convertToPointList("(10,10)-(14,15)");

        Point p1 = pointList.get(0);
        assertTrue(p1.isEqualsXY(10,10));

        Point p2 = pointList.get(1);
        assertTrue(p2.isEqualsXY(14,15));

    }

    @Test
    void convertToPointList2() {
        List<Point> pointList = ParsingUtils.convertToPointList("(10,10)-(22,10)-(22,18)-(10,18)");
        for(Point p: pointList){
            System.out.println(p.toString());
        }

        Point p1 = pointList.get(0);
        assertTrue(p1.isEqualsXY(10,10));

        Point p2 = pointList.get(1);
        assertTrue(p2.isEqualsXY(22,10));

        Point p3 = pointList.get(2);
        assertTrue(p3.isEqualsXY(22,18));

        Point p4 = pointList.get(3);
        assertTrue(p4.isEqualsXY(10,18));

    }
}
