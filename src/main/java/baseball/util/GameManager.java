package baseball.util;

import baseball.domain.dto.BaseballResult;
import baseball.option.GameStatus;

import static baseball.option.GameOption.GAME_END_STRIKE_COUNT;
import static baseball.option.GameOption.RESTART_NUMBER;
import static baseball.option.GameOption.STOP_NUMBER;

public class GameManager {
    private GameManager() {
    }

    public static GameStatus isContinue(BaseballResult baseballResult) {
        if (baseballResult.strikeCount() == GAME_END_STRIKE_COUNT) {
            return GameStatus.RESTART;
        }
        return GameStatus.RUN;
    }

    public static GameStatus isRestart(int number) {
        if (number == RESTART_NUMBER) {
            return GameStatus.RUN;
        }
        if (number == STOP_NUMBER) {
            return GameStatus.STOP;
        }
        throw new IllegalArgumentException(RESTART_NUMBER + " 또는 " + STOP_NUMBER + "를 입력하세요.");
    }
}
