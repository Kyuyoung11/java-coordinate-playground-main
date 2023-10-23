package coordinate;

import coordinate.domains.Point;
import coordinate.domains.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RectangleTest {
    List<Point> pointList;
    Point p1,p2,p3,p4;

    @BeforeEach
    void setUp() {

        p1 = new Point(1,2);
        p2 = new Point(2,2);
        p3 = new Point(1,4);
        p4 = new Point (2,4);

        pointList = Arrays.asList(p1,p2,p3,p4);

    }

    @Test
    void 생성자_테스트_성공() {
        Rectangle rectangle = new Rectangle(pointList);
    }

    @Test
    void 생성자_테스트_실패_사이즈() {
        Point p5 = new Point(1,7);
        pointList = Arrays.asList(p1,p2,p3,p4,p5);

        assertThatThrownBy(()->new Rectangle(pointList)).hasMessageContaining("점의 개수가");
    }

    @Test
    void 생성자_테스트_실패_직사각형() {
        Point p2 = new Point(1,7);
        pointList = Arrays.asList(p1,p2,p3,p4);

        assertThatThrownBy(()->new Rectangle(pointList)).hasMessageContaining("직사각형이 아닙니다");
    }
}
