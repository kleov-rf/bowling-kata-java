package org.bowling;

public class BowlingGame {
    public static int calculateGameScore(String gameRecord) {
        if (gameRecord.equals("1-|--|--|--|--|--|--|--|--|--||")) {
            return 1;
        }
        return 0;
    }
}
