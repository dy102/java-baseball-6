package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

import static baseball.option.GameOption.RESTART_NUMBER;
import static baseball.option.GameOption.STOP_NUMBER;

public class Input {
    private Input() {
    }

    public static List<Integer> number() {
        System.out.println("숫자를 입력해주세요 : ");
        return Converter.stringToList(Console.readLine());
    }

    public static int restart() {
        System.out.println("게임을 새로 시작하려면 " + RESTART_NUMBER + ", 종료하려면 " + STOP_NUMBER + "를 입력하세요.");
        return Converter.stringToInt(Console.readLine());
    }
}
