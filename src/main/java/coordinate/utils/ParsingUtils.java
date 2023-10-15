package coordinate.utils;

import coordinate.domains.Point;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingUtils {
    public static List<Point> convertToPointList(String coordinate) {
        //1. - 기준으로 split
        //2.
        return null;
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
