package coordinate;

import coordinate.domains.Point;
import coordinate.utils.ParsingUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParsingUtilsTest {
    @Test
    void convertToPointList() {
        Point p = ParsingUtils.convertToPoint("(10,11)");
        assertEquals(p.getXValue(), 10);
        assertEquals(p.getYValue(), 11);

    }
}
