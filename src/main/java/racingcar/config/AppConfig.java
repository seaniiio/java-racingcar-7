package racingcar.config;

import racingcar.controller.RacingController;
import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {

    public RacingController createRacingController() {
        return new RacingController(createInputView(),
                createOutputView(),
                createRacingService());
    }

    private InputView createInputView() {
        return new InputView();
    }

    private OutputView createOutputView() {
        return new OutputView();
    }

    private RacingService createRacingService() {
        return new RacingService();
    }
}
