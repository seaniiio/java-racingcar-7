package racingcar.view;

import java.util.List;
import racingcar.domain.dto.CarDto;
import racingcar.domain.dto.CarsDto;

public class OutputView {

    public void printCarsStatus(List<CarsDto> carsStatus) {
        System.out.println(System.lineSeparator() + "실행 결과");

        for (CarsDto status : carsStatus) {
            List<CarDto> carsStageStatus = status.getCarsStageStatus();
            carsStageStatus.stream()
                    .map(CarDto::carStatusMessage)
                    .forEach(System.out::println);
            System.out.println();
        }
    }

    public void printWinners(List<String> winners) {
        System.out.printf("최종 우승자 : ");
        System.out.println(String.join(", ", winners));
    }
}
