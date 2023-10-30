package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Numbers {
    private static final String SEPARATOR = "";
    private static final int NUMBERS_SIZE = 3;

    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return this.numbers;
    }

    private List<Integer> splitNumbers(String numbers) {
        return Arrays.stream(numbers.split(SEPARATOR))
                .map(Integer::valueOf)
                .toList();
    }

    public long countContains(String gameNumbers) {
        List<Integer> integers = splitNumbers(gameNumbers);
        return this.numbers.stream()
                .filter(number -> integers.contains(number))
                .count();
    }

    public long countMatching(String gameNumbers) {
        List<Integer> integers = splitNumbers(gameNumbers);

        return IntStream.range(0, NUMBERS_SIZE)
                .filter(i -> Objects.equals(integers.get(i), numbers.get(i)))
                .count();
    }
}
