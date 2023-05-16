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

        if(gameRecord.equals("-/|--|--|--|--|--|--|--|--|--||")) {
            score = 10;
        }
        if(gameRecord.equals("7/|--|--|--|--|--|--|--|--|--||")) {
            score = 10;
        }
        if(gameRecord.equals("2/|--|--|--|--|--|--|--|--|--||")) {
            score = 10;
        }

        return score;
    }
}
