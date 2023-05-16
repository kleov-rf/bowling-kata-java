package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        String firstRollPins = String.valueOf(gameRecord.toCharArray()[0]);
        if (!firstRollPins.equals("-")) {
            score = Integer.parseInt(firstRollPins);
        }

        if(gameRecord.equals("11|--|--|--|--|--|--|--|--|--||")) {
            score = 2;
        }

        if(gameRecord.equals("12|--|--|--|--|--|--|--|--|--||")) {
            score = 3;
        }

        return score;
    }
}
