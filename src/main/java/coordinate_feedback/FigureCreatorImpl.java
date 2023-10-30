package coordinate_feedback;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class FigureCreatorImpl implements FigureCreator{
    @Override
    public Figure create(List<Point> points) {

        Map<Integer, Supplier<Figure>> figures = new HashMap<>();
        figures.put(2, () -> new Line(points));
        figures.put(3, () -> new Triangle(points));
        figures.put(4, () -> new Rectangle(points));
        return figures.get(points.size()).get();
    }
}
