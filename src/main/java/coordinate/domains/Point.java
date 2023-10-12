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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
