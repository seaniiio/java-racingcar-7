package racingcar.constant;

public enum ErrorMessage {

    CAR_NAME_DUPLICATED_ERROR("중복되는 자동차가 존재합니다."),
    CAR_NAME_LENGTH_ERROR("자동차 이름은 1자 이상 5자 이하여야 합니다.");

    private static final String PREFIX = "[ERROR] ";

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return PREFIX + this.errorMessage;
    }
}
