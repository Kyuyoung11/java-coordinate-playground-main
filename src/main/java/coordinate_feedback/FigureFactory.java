package coordinate_feedback;



import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class FigureFactory {
    private static Map<Integer, Supplier<Figure>> figures;

    static Figure getInstance(List<Point> points) {
        figures = new HashMap<>();
        figures.put(2, (Supplier<Figure>) new Line(points));
        figures.put(3, (Supplier<Figure>) new Triangle(points));
        figures.put(4, (Supplier<Figure>) new Rectangle(points));

        try {
            return figures.get(points.size()).get();
        } catch(NullPointerException e) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }


//        if (points.size() == Line.LINE_POINT_SIZE) {
//            return new Line(points);
//        }
//
//        if (points.size() == Triangle.TRIANGLE_POINT_SIZE) {
//            return new Triangle(points);
//        }
//
//        if (points.size() == Rectangle.RECTANGLE_POINT_SIZE) {
//            return new Rectangle(points);
//        }
//
//        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }



}
