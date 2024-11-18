package racingcar.service;

import java.util.List;
import racingcar.Parser.Parser;
import racingcar.domain.Cars;

public class RacingService {

    private Cars cars;
    private int count;

    public void setCarNames(String carNamesRaw) {
        List<String> carNames = Parser.parseCarNames(carNamesRaw);
        this.cars = Cars.createCars(carNames);
    }

    public void setCount(String countRaw) {
        this.count = Parser.parseCount(countRaw);
    }


}
