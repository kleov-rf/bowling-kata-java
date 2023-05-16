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

    private static Stream<Arguments> spareCasesForFirstFrame() {
        String gameRecordFormat = "/|--|--|--|--|--|--|--|--|--||";
        return Stream.of(
                Arguments.of("-" + gameRecordFormat, 10),
                Arguments.of("7" + gameRecordFormat, 10),
                Arguments.of("2" + gameRecordFormat, 10)
        );
    }

    @Test
    void return_0_when_given_no_strikes_game() {
        String gameRecord = "--|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 0;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @ParameterizedTest
    @MethodSource("casesForSingleFirstRoll")
    void return_score_of_first_roll(String gameRecord, int expectedScore) {
        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @ParameterizedTest
    @MethodSource("simpleCasesForFirstFrame")
    void return_2_when_rolling_1_and_1_in_first_frame(String gameRecord, int expectedScore){
        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @ParameterizedTest
    @MethodSource("spareCasesForFirstFrame")
    void return_10_when_rolling_a_spare_on_first_frame(String gameRecord, int expectedScore) {
        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void return_10_when_rolling_a_strike_on_first_frame() {
        String gameRecord = "X|--|--|--|--|--|--|--|--|--||";
        int expectedScore = 10;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void return_3_when_rolling_1_and_2_in_second_frame() {
        String gameRecord = "--|12|--|--|--|--|--|--|--|--||";
        int expectedScore = 3;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void return_9_when_rolling_4_and_5_in_second_frame() {
        String gameRecord = "--|45|--|--|--|--|--|--|--|--||";
        int expectedScore = 9;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void return_10_when_rolling_a_spare_in_second_frame() {
        String gameRecord = "--|-/|--|--|--|--|--|--|--|--||";
        int expectedScore = 10;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }

    @Test
    void return_10_when_rolling_a_strike_in_second_frame() {
        String gameRecord = "--|X|--|--|--|--|--|--|--|--||";
        int expectedScore = 10;

        int score = BowlingGame.calculateGameScore(gameRecord);

        assertEquals(expectedScore, score);
    }
}
