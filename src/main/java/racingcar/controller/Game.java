package racingcar.controller;

import racingcar.constants.GameRule;
import racingcar.constants.GameStatus;
import racingcar.domain.Computer;
import racingcar.domain.ComputerNumber;
import racingcar.domain.UserNumber;
import racingcar.view.InputView;
import racingcar.view.OutView;

public class Game {

    public void start() {
        OutView.printGameStart();
        do {
            play();
            OutView.printGameOver();
            OutView.printGameRestart();
        } while (checkRestartOrExit(InputView.inputNumber()) == GameStatus.RESTART);
    }

    private void play() {
        GameRule gameRule;
        ComputerNumber computerNumbers = ComputerNumber.generateRandomNumbers();
        do {
            OutView.printGameInput();
            String input = InputView.inputNumber();
            UserNumber userNumbers = UserNumber.of(input);
            gameRule = Computer.calculate(computerNumbers, userNumbers);
            OutView.printGameResult(gameRule.getKorean());
        } while (gameRule != GameRule.THREESTRIKE);
    }

    private GameStatus checkRestartOrExit(String number) {
        return GameStatus.of(convertRestartNumber(number));
    }

    private int convertRestartNumber(String number) {
        return Integer.parseInt(number);
    }
}
