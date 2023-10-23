package coordinate;

import coordinate.domains.PointCalculator;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class Main {
    public static void main(String[] args) {
        //1.입력 받기
        String coordinateInput = InputView.getCoordinateInput();

        //2.좌표계산기 생성
        PointCalculator pointCalculator = new PointCalculator(coordinateInput);

        //3.거리 출력
        OutputView.printArea(pointCalculator);
    }
}
