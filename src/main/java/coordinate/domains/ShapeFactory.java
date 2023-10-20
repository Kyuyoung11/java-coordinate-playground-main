package coordinate.domains;

import java.util.List;

public class ShapeFactory {
    public Shape newInstance(List<Point> points) {
        Shape shape = null;
        if(points.size()==2) {
            shape = new Line(points);
        } else if (points.size()==4) {
            shape = new Rectangle(points);
        }
        return shape;
    }
}
