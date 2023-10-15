package coordinate.utils;

import coordinate.domains.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {
    public static List<Point> convertToPointList(String coordinate) {
        List<Point> pointList = new ArrayList<>();

        //1. "-" 기준으로 split
        String[] pointStrings = coordinate.split("-");

        //2. point 문자열 -> Point 객체 생성
        for (String point : pointStrings) {
            pointList.add(convertToPoint(point));
        }

        return pointList;
    }

    public static Point convertToPoint(String point) {
        Pattern pattern = Pattern.compile("[(](.*?)[,](.*?)[)]");
        Matcher matcher = pattern.matcher(point);
        if (!matcher.find()) {
            throw new IllegalArgumentException("올바른 좌표 문자열이 아닙니다.");
        }
        return new Point(converToInt(matcher.group(1)), converToInt(matcher.group(2)));
    }

    public static int converToInt(String str) {
        return Integer.parseInt(str);
    }
}
