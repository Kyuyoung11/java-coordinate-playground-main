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
}
