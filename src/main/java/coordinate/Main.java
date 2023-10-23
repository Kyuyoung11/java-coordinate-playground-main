package coordinate;

import coordinate.domains.Point;
import coordinate.domains.PointCalculator;
import coordinate.utils.ParsingUtils;
import coordinate.view.InputView;
import coordinate.view.OutputView;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1.입력 받기
        String coordinateInput = InputView.getCoordinateInput();

        //2.좌표계산기 생성
        List<Point> points = ParsingUtils.convertToPointList(coordinateInput);
        PointCalculator pointCalculator = new PointCalculator(points);

        //3.면적 출력
        OutputView.printArea(pointCalculator);
    }
}
