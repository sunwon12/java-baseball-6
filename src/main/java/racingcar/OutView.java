package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class OutView {
    public void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.\n");
    }

    public void printGameInput() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public void printGameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printGameRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void printGameResult(String status) {
        System.out.println(status);

    }
}
