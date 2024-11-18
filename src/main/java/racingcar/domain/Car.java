package racingcar.domain;

import java.util.Objects;
import racingcar.RandomNumberMachine.RandomNumberMachine;
import racingcar.constant.ErrorMessage;
import racingcar.domain.dto.CarDto;

public class Car {

    private final String name;
    private int distance;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
    }

    public void race() {
        int randomNumber = RandomNumberMachine.createRandomNumber();
        if (randomNumber >= 4) {
            this.distance += 1;
        }
    }

    public CarDto createCarDto() {
        return new CarDto(this.name, this.distance);
    }

    private void validate(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.CAR_NAME_LENGTH_ERROR.getErrorMessage());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
