package org.bowling;

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

    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstFrame = gameRecord.split("\\|")[0];

        if(firstFrame.length() == 2){
            score = calculateFrameScore(firstFrame);
        }

        if(firstFrame.contains("X")){
            score = 10;
        }

        if(firstFrame.contains("/")){
            score = 10;
        }

        return score;
    }
}
