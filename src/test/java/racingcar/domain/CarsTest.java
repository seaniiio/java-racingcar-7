package racingcar.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.constant.ErrorMessage;

class CarsTest {

    @DisplayName("자동차 이름이 중복되는 경우 예외 발생")
    @Test
    void 자동차_이름_중복_예외() {
        List<String> carNames = List.of("car", "car");

        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> Cars.createCars(carNames))
                .withMessageContaining(ErrorMessage.CAR_NAME_DUPLICATED_ERROR.getErrorMessage());
    }
}
