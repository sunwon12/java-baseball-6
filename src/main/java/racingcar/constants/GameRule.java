package racingcar.constants;

public enum GameRule {
    ONEBALL("1볼","001"),
    TWOBALL("2볼","002"),
    THREEBALL("3볼","003"),
    ONEBALLANDONESTRIKE("1볼 1스트라이크","101"),
    TWOBALLANDONESTRIKE("2볼 1스트라이크","201"),
    ONESTRIKE("1스트라이크","100"),
    TWOSTRIKE("2스트라이크","200"),
    THREESTRIKE("3스트라이크","300"),
    NOTHING("낫싱","000");

    private String korean;
    private String codeNumber;

    GameRule(String korean, String codeNumber) {
        this.korean = korean;
        this.codeNumber = codeNumber;
    }

    public String getKorean() {
        return this.korean;
    }

     public static GameRule createStatus(String strike, String ball) {
        String codeNumber = strike + 0 + ball;
        return fromCodeNumber(codeNumber);
    }

    private static GameRule fromCodeNumber(String codeNumber) {
        for (GameRule gameRule : GameRule.values()) {
            if (gameRule.codeNumber.equals(codeNumber)) {
                return gameRule;
            }
        }
        throw new IllegalArgumentException("일치하는 코드번호가 없습니다.: " + codeNumber);
    }

}
