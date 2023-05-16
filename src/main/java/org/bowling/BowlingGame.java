package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstFrameFirstRoll = gameRecord.split("")[0];
        String firstFrameSecondRoll = gameRecord.split("")[1];
        if (!firstFrameFirstRoll.equals("-")) {
            score += Integer.parseInt(firstFrameFirstRoll);
        }
        if (!firstFrameSecondRoll.equals("-") && !firstFrameSecondRoll.equals("/")) {
            score += Integer.parseInt(firstFrameSecondRoll);
        }

        return score;
    }
}
