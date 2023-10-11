package coordinate;

import coordinate.domains.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {
    @Test
    void Point_생성자() {
        Point p = new Point(1,2);
        assertEquals(p.getX(), 1);
        assertEquals(p.getY(), 2);
    }
}
