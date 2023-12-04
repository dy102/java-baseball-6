package baseball.service;

import baseball.domain.Baseballs;
import baseball.domain.Computer;
import baseball.domain.dto.BaseballResult;
import baseball.option.GameStatus;
import baseball.util.GameManager;
import baseball.view.Input;

public class BaseballService {
    private Computer computer;

    public BaseballService(Computer computer) {
        this.computer = computer;
    }

    public BaseballResult compareNumbers() {
        Baseballs baseballs = new Baseballs(Input.number());
        return computer.compareNumbers(baseballs.numbers());
    }

    public GameStatus isContinue(BaseballResult baseballResult) {
        return GameManager.isContinue(baseballResult);
    }
}
