package racingcar;

import racingcar.constants.GameRule;

public class Computer {

    private Numbers numbers;

    public Computer() {
        numbers = new Numbers();
    }

    public void generateRandomNumbers() {
        numbers.createNumbers();
    }

    public GameRule calculate(String gameNumbers) {
        long totalCount = numbers.countContains(gameNumbers);
        long strikeCount = numbers.countMatching(gameNumbers);
        long ballCount = Math.abs(strikeCount - totalCount);

        System.out.println("totalCount:" + totalCount);
        System.out.println("strikeCount:" + strikeCount);
        System.out.println("ballCount:" + ballCount);
        System.out.println("컴퓨터 숫자:" + numbers.getNumbers().get(0)+ numbers.getNumbers().get(1) + numbers.getNumbers().get(2) ); //TODO
        return GameRule.createStatus(String.valueOf(strikeCount), String.valueOf(ballCount));
    }


}
