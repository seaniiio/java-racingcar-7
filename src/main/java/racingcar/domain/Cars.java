package racingcar.domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.constant.ErrorMessage;

public class Cars {

    private final List<Car> cars;

    private Cars(List<Car> cars) {
        this.cars = cars;
    }

    public static Cars createCars(List<String> carNames) {
        List<Car> cars = carNames.stream().map(Car::new).toList();
        validate(cars);
        return new Cars(cars);
    }

    private static void validate(List<Car> cars) {
        Set<Car> distinctCars = new HashSet<>(cars);
        if (cars.size() != distinctCars.size()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_DUPLICATED_ERROR.getErrorMessage());
        }
    }
}
