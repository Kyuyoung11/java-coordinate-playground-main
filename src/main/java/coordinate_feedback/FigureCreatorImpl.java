package coordinate_feedback;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class FigureCreatorImpl implements FigureCreator{
    @Override
    public Figure create(List<Point> points) {

        Map<Integer, Supplier<Figure>> figures = new HashMap<>();
        figures.put(2, (Supplier<Figure>) new Line(points));
        figures.put(3, (Supplier<Figure>) new Triangle(points));
        figures.put(4, (Supplier<Figure>) new Rectangle(points));
        return figures.get(points.size()).get();
    }
}
