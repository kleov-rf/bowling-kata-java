package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstRollPins = String.valueOf(gameRecord.toCharArray()[0]);
        if (!firstRollPins.equals("-")) {
            score = Integer.parseInt(firstRollPins);
        }

        return score;
    }
}
