package baseball.domain;

import baseball.domain.dto.BaseballResult;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.option.GameOption.NUMBER_LENGTH;
import static baseball.option.GameOption.NUMBER_MAXIMUM_BOUND;
import static baseball.option.GameOption.NUMBER_MINIMUM_BOUND;

public class Computer {
    private final List<Integer> numbers;

    private Computer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static Computer makeRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(NUMBER_MINIMUM_BOUND, NUMBER_MAXIMUM_BOUND);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return new Computer(computer);
    }

    public BaseballResult compareNumbers(Baseballs baseballs) {
        int strikeCount = 0;
        int ballCount = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(baseballs.numbers().get(i))) {
                strikeCount++;
                continue;
            }
            if (numbers.contains(baseballs.numbers().get(i))) {
                ballCount++;
            }
        }
        return new BaseballResult(strikeCount, ballCount);
    }
}
