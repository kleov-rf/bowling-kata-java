package org.bowling;

public class BowlingGame {

    private static boolean isRollNumeric(String roll) {
        return !(
                roll.equals("|") ||
                roll.equals("-") ||
                roll.equals("/") ||
                roll.equals("X")
        );
    }

    private static boolean isRollSpare(String roll) {
        return roll.equals("/");
    }

    private static boolean isRollStrike(String roll){
        return roll.equals("X");
    }

    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstFrameFirstRoll = gameRecord.split("")[0];
        String firstFrameSecondRoll = gameRecord.split("")[1];

        if (isRollNumeric(firstFrameFirstRoll)) {
            score += Integer.parseInt(firstFrameFirstRoll);
        }
        if (isRollNumeric(firstFrameSecondRoll)) {
            score += Integer.parseInt(firstFrameSecondRoll);
        }

        if(isRollSpare(firstFrameSecondRoll)) {
            score = 10;
        }

        if(isRollStrike(firstFrameFirstRoll)){
            score = 10;
        }

        return score;
    }
}
