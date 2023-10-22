package coordinate;

import coordinate.domains.Point;
import coordinate.utils.SortingUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortingUtilsTest {
    List<Point> pointList;
    Point p1,p2,p3,p4;

    @BeforeEach
    void setUp() {

        p1 = new Point(1,1);
        p2 = new Point(2,2);
        p3 = new Point(1,4);
        p4 = new Point (2,1);

        pointList = Arrays.asList(p1,p2,p3,p4);

    }
    @Test
    void 정렬테스트() {

        List<Point> sortedList = SortingUtils.sortPointsXY(pointList);
        for (Point p : sortedList) {
            System.out.println(p.getXValue() + " : " + p.getYValue());
        }

        assertTrue(sortedList.get(0).isEqualsPoint(p1));
        assertTrue(sortedList.get(1).isEqualsPoint(p3));
        assertTrue(sortedList.get(2).isEqualsPoint(p4));
        assertTrue(sortedList.get(3).isEqualsPoint(p2));


    }
}
