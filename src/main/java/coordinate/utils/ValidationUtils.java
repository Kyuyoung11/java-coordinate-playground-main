package coordinate.utils;

public class ValidationUtils {
    public static void validateSize(int inputSize, int size){
        if (inputSize != size) {
            throw new IllegalArgumentException("점의 개수가 올바르지 않습니다.");
        }
    }
}
