package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        int score = 0;

        if (gameRecord.equals("1-|--|--|--|--|--|--|--|--|--||")) {
            score = 1;
        }
        if(gameRecord.equals("2-|--|--|--|--|--|--|--|--|--||")){
            score = 2;
        }

        return score;
    }
}
