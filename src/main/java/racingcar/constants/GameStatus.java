package racingcar.constants;

import racingcar.validator.InputValidator;

import java.util.Arrays;

public enum GameStatus {
    RESTART(1),
    QUIT(2);

    private final int decisionNumber;

    GameStatus(int decisionNumber) {
        this.decisionNumber = decisionNumber;
    }

    public static GameStatus of(int number) {
        InputValidator.validateRestartNumber(number);
        return Arrays.stream(GameStatus.values())
                .filter(status -> status.decisionNumber == number)
                .findFirst()
                .orElseThrow();
    }
}
