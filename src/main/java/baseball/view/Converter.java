package baseball.view;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    private Converter() {
    }

    public static List<Integer> stringToList(String number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < number.length(); i++) {
            try {
                numbers.add(Integer.parseInt(Character.toString(number.charAt(i))));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException numberFormatException) {
                throw new IllegalArgumentException("잘못된 형식입니다.");
            }
        }
        return numbers;
    }

    public static int stringToInt(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 형식입니다.");
        }
    }
}
