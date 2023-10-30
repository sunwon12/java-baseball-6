package racingcar.domain;

import racingcar.constants.GameRule;

public class Computer {

    public static GameRule calculate(ComputerNumber computerNumber, UserNumber userNumbers) {
        long totalCount = userNumbers.countContains(computerNumber);
        long strikeCount = userNumbers.countMatching(computerNumber);
        long ballCount = Math.abs(strikeCount - totalCount);

        return GameRule.createStatus(String.valueOf(strikeCount), String.valueOf(ballCount));
    }
}
