package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constant.ErrorMessage;

class CarTest {

    @DisplayName("자동차 이름이 1자 이상 5자 이하가 아닌 경우 예외")
    @ParameterizedTest
    @ValueSource(strings = {"siwoni", ""})
    void 자동차_이름_길이_예외_테스트(String carName) {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> new Car(carName))
                .withMessageContaining(ErrorMessage.CAR_NAME_LENGTH_ERROR.getErrorMessage());
    }
}
