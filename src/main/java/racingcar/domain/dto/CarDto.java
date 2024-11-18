package racingcar.domain.dto;

public class CarDto {

    private final String name;
    private final int distance;

    public CarDto(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String carStatusMessage() {
        return name + ":" + "-".repeat(distance);
    }
}
