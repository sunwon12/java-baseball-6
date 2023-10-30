package racingcar.view;

public class OutView {
    public static void printGameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.\n");
    }

    public static void printGameInput() {
        System.out.println("숫자를 입력해주세요 : ");
    }

    public static void printGameOver() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static void printGameRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public static void printGameResult(String status) {
        System.out.println(status);

    }
}
