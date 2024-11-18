package racingcar.domain;

import java.util.Objects;
import racingcar.constant.ErrorMessage;

public class Car {

    private final String name;
    private int distance;

    public Car(String name) {
        validate(name);
        this.name = name;
        this.distance = 0;
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
