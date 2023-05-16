package org.bowling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameShould {
    private static Stream<Arguments> casesForSingleFirstRoll() {
        String gameRecordFormat = "-|--|--|--|--|--|--|--|--|--||";
        return Stream.of(
                Arguments.of("1" + gameRecordFormat, 1),
                Arguments.of("2" + gameRecordFormat, 2),
                Arguments.of("3" + gameRecordFormat, 3)
        );
    }
    private static Stream<Arguments> simpleCasesForFirstFrame() {
        String gameRecordFormat = "|--|--|--|--|--|--|--|--|--||";
        return Stream.of(
                Arguments.of("11" + gameRecordFormat, 2),
                Arguments.of("12" + gameRecordFormat, 3)
        );
    }

    @Test
    void should_return_0_when_given_no_strikes_game() {
        String gameRecord = "--|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 0;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @ParameterizedTest
    @MethodSource("casesForSingleFirstRoll")
    void should_return_score_of_first_roll(String gameRecord, int expectedScore) {
        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @ParameterizedTest
    @MethodSource("simpleCasesForFirstFrame")
    void should_return_2_when_rolling_1_and_1_in_first_frame(String gameRecord, int expectedScore){
        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

}
