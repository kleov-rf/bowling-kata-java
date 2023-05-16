package org.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameShould {

    @Test
    void should_return_0_when_given_no_strikes_game() {
        String gameRecord = "--|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 0;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void should_return_1_when_given_one_pin_down_in_all_frames() {
        String gameRecord = "1-|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 1;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void should_return_2_when_given_two_pins_down_in_a_roll() {
        String gameRecord = "2-|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 2;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void should_return_3_when_given_three_pins_down_in_a_roll() {
        String gameRecord = "3-|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 3;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

}
