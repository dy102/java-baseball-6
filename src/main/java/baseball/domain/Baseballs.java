package baseball.domain;

import java.util.List;

import static baseball.option.GameOption.NUMBER_LENGTH;

public record Baseballs(List<Integer> numbers) {
    public Baseballs {
        validate(numbers);
    }

    public void validate(List<Integer> numbers) {
        validateRange(numbers);
        validateDuplication(numbers);
    }

    public void validateRange(List<Integer> numbers) {
        if (numbers.size() != NUMBER_LENGTH) {
            throw new IllegalArgumentException(NUMBER_LENGTH + "자리 수를 입력해야 합니다.");
        }
    }

    public void validateDuplication(List<Integer> numbers) {
        if (isDuplication(numbers)) {
            throw new IllegalArgumentException("중복된 숫자는 입력할 수 없습니다.");
        }
    }

    public boolean isDuplication(List<Integer> numbers) {
        return numbers.stream()
                .distinct().toList().size() != numbers.size();
    }
}

