package coordinate.domains;

public class Value {
    private static final int MAX_VALUE = 24;
    private final int value;

    public Value(int value) {
        _validate(value);
        this.value = value;
    }

    private void _validate(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("0 이상의 값을 입력해주세요.");
        }

        if (value > MAX_VALUE) {
            throw new IllegalArgumentException(MAX_VALUE+"까지만 입력할 수 있습니다.");
        }
    }

    public int getValue() {
        return this.value;
    }


}
