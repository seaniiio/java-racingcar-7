package racingcar.constant;

public enum ErrorMessage {

    CAR_NAME_DUPLICATED_ERROR("중복되는 자동차가 존재합니다."),
    CAR_NAME_LENGTH_ERROR("자동차 이름은 1자 이상 5자 이하여야 합니다."),
    CAR_NAME_FORMAT_ERROR("자동차 이름의 형식이 올바르지 않습니다."),

    COUNT_FORMAT_ERROR("시도 횟수의 형식이 올바르지 않습니다."),
    COUNT_BOUND_ERROR("시도 횟수는 1 이상이어야 합니다.");


    private static final String PREFIX = "[ERROR] ";

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return PREFIX + this.errorMessage;
    }
}
