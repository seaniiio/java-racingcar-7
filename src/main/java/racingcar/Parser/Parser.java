package racingcar.Parser;

import java.util.Arrays;
import java.util.List;
import racingcar.constant.ErrorMessage;

public class Parser {

    private static final String DELIMITER = ",";

    public static List<String> parseCarNames(String carNamesRaw) {
        return Arrays.stream(carNamesRaw.split(DELIMITER)).toList();
    }

    public static int parseCount(String countRaw) {
        validateCountFormat(countRaw);
        int count = Integer.parseInt(countRaw);
        validateCountPositive(count);
        return count;
    }

    private static void validateCountFormat(String countRaw) {
        try {
            Integer.parseInt(countRaw);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.COUNT_FORMAT_ERROR.getErrorMessage());
        }
    }

    private static void validateCountPositive(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException(ErrorMessage.COUNT_BOUND_ERROR.getErrorMessage());
        }
    }
}
