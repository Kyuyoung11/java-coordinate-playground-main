package coordinate.view;

import coordinate.domains.PointCalculator;

public class OutputView {
    public static void printDistance(PointCalculator pointCalculator) {
        double distance = pointCalculator.calculateArea();
        System.out.printf("두 점 사이 거리는 %.6f%n", distance);
    }
}
