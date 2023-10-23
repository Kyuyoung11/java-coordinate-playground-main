package coordinate;

import coordinate.domains.Point;
import coordinate.domains.PointCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointCalculatorTest {
    private PointCalculator pointCalculator;

    @BeforeEach
    void setUp() {

        Point p1 = new Point(1,1);
        Point p2 = new Point(2,2);


        pointCalculator = new PointCalculator(Arrays.asList(p1,p2));
    }

    @Test
    void String생성자_테스트() {
        this.pointCalculator = new PointCalculator("(10,10)-(14,15)");
    }



    @Test
    void 길이계산_테스트() {

        double distance = this.pointCalculator.calculateArea();
        System.out.println(distance);
        assertEquals(Math.round(distance), 1);
    }

}
