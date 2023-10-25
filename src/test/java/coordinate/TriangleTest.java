package coordinate;

import coordinate.domains.Point;
import coordinate.domains.Rectangle;
import coordinate.domains.Triangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {
    List<Point> pointList;
    Point p1,p2,p3;

    @BeforeEach
    void setUp() {

        p1 = new Point(10,10);
        p2 = new Point(14,15);
        p3 = new Point(20,8);

        pointList = Arrays.asList(p1,p2,p3);

    }

    @Test
    void 면적계산() {
        Triangle triangle = new Triangle(pointList);
        assertEquals((int)triangle.calculateArea(),29);
    }
}
