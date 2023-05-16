package org.bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameShould {

    @Test
    void should_return_0_when_given_no_strikes_game() {
        assertEquals(0, BowlingGame.calculateGameScore("--|--|--|--|--|--|--|--|--|--||"));
    }

}
