package racingcar.Parser;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.constant.ErrorMessage;

class ParserTest {

    @DisplayName("시도 횟수가 0 이하인 경우 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"0", "-1"})
    void 시도_횟수_범위_예외_테스트(String count) {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> Parser.parseCount(count))
                .withMessageContaining(ErrorMessage.COUNT_BOUND_ERROR.getErrorMessage());
    }

    @DisplayName("시도 횟수의 형식이 올바르지 않은 경우 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"", "\n", " ", "3번"})
    void 시도_횟수_형식_예외_테스트(String count) {
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> Parser.parseCount(count))
                .withMessageContaining(ErrorMessage.COUNT_FORMAT_ERROR.getErrorMessage());
    }
}
