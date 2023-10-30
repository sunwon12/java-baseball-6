package racingcar.validator;

import racingcar.constants.ExceptionMessage;

import java.util.regex.Pattern;

public class InputValidator {

    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^[0-9]*$");
    private static final int NUMBERS_SIZE = 3;
    public static void validateNumberic(String numbers) {
        if (numbers.isBlank() || !NUMERIC_PATTERN.matcher(numbers).matches()) {
            throw new IllegalArgumentException(ExceptionMessage.NOT_NUMBER.getMessage());
        }
    }

    public static void validateRange(String numbers) {
        numbers.chars()
                .map(number -> number -='0')
                .filter(number -> 1 > number || 9 < number)
                .findAny()
                .ifPresent(number ->
                {
                    throw new IllegalArgumentException(ExceptionMessage.NOT_NUMBER_RANGE.getMessage());
                });
    }

    public static void validateDistinctNumbers(String numbers) {
        long distinctCount = numbers.chars()
                .distinct()
                .count();
        if (distinctCount != NUMBERS_SIZE)
            throw new IllegalArgumentException(ExceptionMessage.NUMBER_DUPLICATE.getMessage());
    }

    public static void validateRestartNumber(int number) {
        if (number != 1 && number !=2)
            throw new IllegalArgumentException(ExceptionMessage.NOT_DECISION_NUMBER.getMessage());
    }

}
