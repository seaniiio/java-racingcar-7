package racingcar.service;

import java.util.List;
import racingcar.Parser.Parser;
import racingcar.domain.Cars;

public class RacingService {

    public void setCarNames(String carNamesRaw) {
        List<String> carNames = Parser.parseCarNames(carNamesRaw);
        Cars cars = Cars.createCars(carNames);
    }
}
