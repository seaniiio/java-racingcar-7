package racingcar.domain.dto;

import java.util.List;

public class CarsDto {

    private final List<CarDto> cars;

    public CarsDto(List<CarDto> cars) {
        this.cars = cars;
    }
}
