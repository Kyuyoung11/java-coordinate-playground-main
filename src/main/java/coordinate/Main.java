package coordinate;

import coordinate.domains.PointCalculator;
import coordinate.view.InputView;

public class Main {
    public static void main(String[] args) {
        //1.입력 받기
        String coordinateInput = InputView._getCoordinateInput();

        //2.좌표계산기 생성
        PointCalculator pointCalculator = new PointCalculator(coordinateInput);

        //3.계산
        pointCalculator.calcDistance();
    }
}
