package baseball.view;

import baseball.domain.dto.BaseballResult;

public class Output {
    private Output() {
    }

    public static void start() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void result(BaseballResult baseballResult) {
        StringBuilder stringBuilder = new StringBuilder();
        if (baseballResult.ballCount() != 0) {
            stringBuilder.append(baseballResult.ballCount() + "볼 ");
        }
        if (baseballResult.strikeCount() != 0) {
            stringBuilder.append(baseballResult.strikeCount() + "스트라이크");
        }
        if (baseballResult.ballCount() == 0 && baseballResult.strikeCount() == 0) {
            stringBuilder.append("낫싱");
        }
        System.out.println(stringBuilder);
    }

    public static void end() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
