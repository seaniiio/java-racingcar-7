package racingcar.service;

import java.util.ArrayList;
import java.util.List;
import racingcar.Parser.Parser;
import racingcar.domain.Cars;
import racingcar.domain.dto.CarsDto;

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

    public List<CarsDto> race() {
        List<CarsDto> carsStatus = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carsStatus.add(cars.race());
        }
        return carsStatus;
    }

    public List<String> decideWinner() {
        return cars.decideWinner();
    }
}
