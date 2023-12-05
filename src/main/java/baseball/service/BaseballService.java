package baseball.service;

import baseball.domain.Baseballs;
import baseball.domain.Computer;
import baseball.domain.dto.BaseballResult;
import baseball.option.GameStatus;
import baseball.util.GameManager;

import java.util.List;

public class BaseballService {
    private final Computer computer;

    public BaseballService(Computer computer) {
        this.computer = computer;
    }

    public BaseballResult compareNumbers(List<Integer> numbers) {
        return computer.compareNumbers(new Baseballs(numbers));
    }

    public GameStatus isContinue(BaseballResult baseballResult) {
        return GameManager.isContinue(baseballResult);
    }

    public GameStatus isRestart(int number) {
        return GameManager.isRestart(number);
    }
}
