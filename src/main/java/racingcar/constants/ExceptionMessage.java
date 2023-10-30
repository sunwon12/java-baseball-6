package racingcar.constants;

public enum ExceptionMessage {

    NOT_NUMBER("숫자를 입력해야 합니다."),
    NOT_NUMBERS_SIZE("3개의 숫자를 입력해야 합니다."),
    NOT_NUMBER_RANGE("1 ~ 9 사이의 숫자를 입력하세요."),
    NUMBER_DUPLICATE("각 자리의 숫자는 달라야 합니다."),
    NOT_DECISION_NUMBER("숫자 1 과 2 중 입력하세요.");

    private String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
