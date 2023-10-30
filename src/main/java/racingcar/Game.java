package racingcar;

import racingcar.constants.GameRule;

public class Game {

    private final OutView outView;
    private final InputView inputView;
    private final Computer computer;

    public Game() {
        this.outView = new OutView();
        this.inputView = new InputView();
        this.computer = new Computer();
    }

    public void start() {
        outView.printGameStart();
        do {
            play();
            outView.printGameOver();
            outView.printGameRestart();
        }while(inputView.checkRestartOrExit());
    }

    private void play() {
        GameRule gameRule;
        ComputerNumber computerNumber = ComputerNumber.generateRandomNumbers();
        do {
            outView.printGameInput();
            String userNumbers = inputView.inputNumber();
            gameRule = computer.calculate(userNumbers);
            outView.printGameResult(gameRule.getKorean());
        } while (gameRule != GameRule.THREESTRIKE);
    }
}
