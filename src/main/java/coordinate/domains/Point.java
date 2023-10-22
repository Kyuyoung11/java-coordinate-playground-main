package coordinate.domains;

public class Point {
    private final Value x;
    private final Value y;

    public Point(int x, int y) {
        this.x = new Value(x);
        this.y = new Value(y);
    }

    public int getXValue() {
        return this.x.getValue();
    }

    public int getYValue() {
        return this.y.getValue();
    }

    public boolean isEqualsXY(int x, int y) {
        return this.x.isEqualValue(x) && this.y.isEqualValue(y);
    }

    public boolean isEqualsPoint(Point point) {
        return this.x.isEqualValue(point.getXValue()) && this.y.isEqualValue(point.getYValue());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
