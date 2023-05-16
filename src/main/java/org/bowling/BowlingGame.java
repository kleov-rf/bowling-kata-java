package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstFrameFirstRoll = String.valueOf(gameRecord.toCharArray()[0]);
        String firstFrameSecondRoll = String.valueOf(gameRecord.toCharArray()[1]);
        if (!firstFrameFirstRoll.equals("-")) {
            score += Integer.parseInt(firstFrameFirstRoll);
        }
        if (!firstFrameSecondRoll.equals("-")) {
            score += Integer.parseInt(firstFrameSecondRoll);
        }

        return score;
    }
}
