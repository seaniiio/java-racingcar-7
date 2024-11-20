package racingcar.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import racingcar.constant.ErrorMessage;
import racingcar.domain.dto.CarsDto;

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

    public CarsDto race() {
        cars.stream().forEach(Car::race);
        return new CarsDto(cars.stream()
                .map(Car::createCarDto)
                .toList());
    }

    public List<String> decideWinner() {
        int maxDistance = findMaxDistance();

        List<String> winners = new ArrayList<>();
        cars.stream()
                .filter(car -> car.getDistance() == maxDistance)
                .forEach(car -> winners.add(car.getName()));

        return winners;
    }

    private int findMaxDistance() {
        return cars.stream().mapToInt(Car::getDistance)
                .max().getAsInt();
    }

    private static void validate(List<Car> cars) {
        Set<Car> distinctCars = new HashSet<>(cars);
        if (cars.size() != distinctCars.size()) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_DUPLICATED_ERROR.getErrorMessage());
        }
    }
}
