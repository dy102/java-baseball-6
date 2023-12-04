package baseball.controller;

import baseball.domain.Computer;
import baseball.domain.dto.BaseballResult;
import baseball.option.GameStatus;
import baseball.service.BaseballService;
import baseball.util.GameManager;
import baseball.view.Input;
import baseball.view.Output;

public class BaseballController {
    private BaseballService baseballService;

    public void run() {
        start();
        GameStatus gameStatus = GameStatus.RUN;
        while (gameStatus == GameStatus.RUN) {
            gameStatus = compareNumbers();
            if (gameStatus == GameStatus.RESTART) {
                gameStatus = restart();
            }
        }
    }

    private void start() {
        baseballService = new BaseballService(Computer.makeRandomNumbers());
        Output.start();
    }

    private GameStatus compareNumbers() {
        GameStatus gameStatus;
        BaseballResult baseballResult = baseballService.compareNumbers(Input.number());
        Output.result(baseballResult);

        gameStatus = baseballService.isContinue(baseballResult);
        return gameStatus;
    }

    private GameStatus restart() {
        GameStatus gameStatus;
        Output.end();
        gameStatus = GameManager.isRestart(Input.restart());
        if (gameStatus == GameStatus.RUN) {
            baseballService = new BaseballService(Computer.makeRandomNumbers());
        }
        return gameStatus;
    }


}
