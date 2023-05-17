package org.bowling;

import java.util.Arrays;

public class BowlingGame {

    private static boolean isRollNumeric(String roll) {
        return !(
                roll.equals("-") ||
                roll.equals("/") ||
                roll.equals("X")
        );
    }

    private static int calculateFrameScore(String frame){
        int score = 0;

        String firstRoll = frame.split("")[0];
        String secondRoll = frame.split("")[1];

        if (isRollNumeric(firstRoll)) {
            score += Integer.parseInt(firstRoll);
        }
        if (isRollNumeric(secondRoll)) {
            score += Integer.parseInt(secondRoll);
        }

        return score;
    }

    private static boolean isFrameSpare(String frame) {
        return frame.contains("/");
    }

    private static boolean isFrameStrike(String frame) {
        return frame.contains("X");
    }

    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String[] frames = gameRecord.split("\\|");

        for (String frame : frames) {
            if(frame.length() == 2 && !isFrameSpare(frame)){
                score += calculateFrameScore(frame);
            }

            if(isFrameSpare(frame)){
                score += 10;
            }

            if(isFrameStrike(frame)){
                score += 10;
            }
        }

        return score;
    }
}
