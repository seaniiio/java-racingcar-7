package racingcar.controller;

import java.util.List;
import racingcar.domain.dto.CarsDto;
import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingController {

    private final InputView inputView;
    private final OutputView outputView;
    private final RacingService racingService;

    public RacingController(InputView inputView, OutputView outputView, RacingService racingService) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.racingService = racingService;
    }

    public void run() {
        racingService.setCarNames(inputView.inputCarNames());
        racingService.setCount(inputView.inputCount());

        List<CarsDto> carsStatus = racingService.race();
        outputView.printCarsStatus(carsStatus);

        List<String> winners = racingService.decideWinner();
        outputView.printWinners(winners);
    }
}
