package org.example.day2;

import static org.example.day2.MockData.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubmarineTest {

    @Test
    void shouldSimpleSubmarineCalculateCorrectly() {
        //given
        SimpleSubmarine submarine = new SimpleSubmarine();

        //when
        int calculation = submarine.run(TEST_COMMANDS);

        //then
        Assertions.assertEquals(150, calculation);
    }

    @Test
    void shouldAdvancedSubmarineCalculateCorrectly() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine();

        //when
        int calculation = submarine.run(TEST_COMMANDS);

        //then
        Assertions.assertEquals(900, calculation);
    }

    @Test
    void shouldSimpleSubmarineReturnZero() {
        //given
        SimpleSubmarine submarine = new SimpleSubmarine();

        //when
        int calculation = submarine.run(TEST_ZERO_MESSAGES_COMMANDS);

        //then
        Assertions.assertEquals(0, calculation);
    }

    @Test
    void shouldAdvancedSubmarineReturnZero() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine();

        //when
        int calculation = submarine.run(TEST_ZERO_MESSAGES_COMMANDS);

        //then
        Assertions.assertEquals(0, calculation);
    }
}