package coordinate;

import coordinate.domains.Point;
import coordinate.utils.PointCalculatorUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointCalculatorTest {
    @Test
    void 길이계산_테스트() {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,2);

        double distance = Math.round(PointCalculatorUtils.calcDistance(p1, p2));
        System.out.println(distance);
        assertEquals(Math.round(distance), 1);
    }
}
