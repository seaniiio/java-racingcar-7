package racingcar.Parser;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private static final String DELIMITER = ",";

    public static List<String> parseCarNames(String carNamesRaw) {
        return Arrays.stream(carNamesRaw.split(DELIMITER)).toList();
    }
}
