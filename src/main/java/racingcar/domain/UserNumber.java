package racingcar.domain;

import racingcar.validator.InputValidator;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class UserNumber {
    private static final String SEPARATOR = "";
    private static final int NUMBERS_SIZE = 3;

    private final List<Integer> numbers;

    private UserNumber(String numbers) {
        InputValidator.validateNumberic(numbers);
        InputValidator.validateRange(numbers);
        InputValidator.validateDistinctNumbers(numbers);

        this.numbers = convertInputNumber(numbers);
    }

    public static UserNumber of(String numbers) {
        return new UserNumber(numbers);
    }

    private List<Integer> convertInputNumber(String numbers) {
        return Arrays.stream(numbers.split(SEPARATOR))
                .map(Integer::valueOf)
                .toList();
    }

    public long countContains(ComputerNumber comparableNumber) {
        return this.numbers.stream()
                .filter(number -> comparableNumber.getNumbers().contains(number))
                .count();
    }

    public long countMatching(ComputerNumber gameNumbers) {
        return IntStream.range(0, NUMBERS_SIZE)
                .filter(i -> Objects.equals(numbers.get(i), gameNumbers.getNumbers().get(i)))
                .count();
    }
}
