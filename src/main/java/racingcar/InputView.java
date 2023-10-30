package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.constants.ExceptionMessage;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class InputView {

    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]*$");
    private static int TOTAL_GAME_COUNT = 3;

    //재시작 여부 검증
    public Boolean checkRestartOrExit() {
        String input = readLine();
        if (!(input.equals("1") || input.equals("2")))
            throw new IllegalArgumentException("1과 2중 입력하세요.");
        if (input.equals("1"))
            return true;
        else
            return false;
    }

    //게임 숫자 입력
    public String inputNumber() {
        String numbers = readLine();
        validateNumberic(numbers);
        validateDistinctNumbers(numbers);
        return numbers;
    }

    private void validateNumberic(String numbers) {
        if (numbers.isBlank() || !NUMERIC_PATTERN.matcher(numbers).matches()) {
            throw new IllegalArgumentException("숫자를 입력하세요");
        }
    }
    private void validateRange(String numbers) {
        numbers.stream()
                .filter(number -> 1 > number || 9 < number)
                .findAny()
                .ifPresent(number ->
                {
                    throw new IllegalArgumentException(ExceptionMessage.NUMBERS_RANGE);
                });
    }
    private void validateDistinctNumbers(String numbers) {
        Set<Character> charSet = new HashSet<>();
        for (char c : numbers.toCharArray()) {
            if (!charSet.add(c)) {
                throw new IllegalArgumentException("중복되지 않은 숫자를 입력하세요.");
            }
        }
    }

    private String readLine() {
        return Console.readLine();
    }

}
