package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class ComputerNumber {

    private List<Integer> numbers;

    private ComputerNumber(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public static ComputerNumber generateRandomNumbers() {
        List<Integer> randomNumbers = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return new ComputerNumber(randomNumbers);
    }
}
