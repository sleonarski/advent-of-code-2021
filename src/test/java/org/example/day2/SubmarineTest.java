package org.example.day2;

import static org.example.day2.MockData.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubmarineTest {

    @Test
    void shouldSimpleSubmarineCalculateCorrectly() {
        //given
        SimpleSubmarine submarine = new SimpleSubmarine(TEST_COMMANDS);

        //when
        submarine.run();

        //then
        Assertions.assertEquals(150, submarine.getDirection());
    }

    @Test
    void shouldAdvancedSubmarineCalculateCorrectly() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine(TEST_COMMANDS);

        //when
        submarine.run();

        //then
        Assertions.assertEquals(900, submarine.getDirection());
    }

    @Test
    void shouldSimpleSubmarineReturnZero() {
        //given
        SimpleSubmarine submarine = new SimpleSubmarine(TEST_ZERO_MESSAGES_COMMANDS);

        //when
        submarine.run();

        //then
        Assertions.assertEquals(0, submarine.getDirection());
    }

    @Test
    void shouldAdvancedSubmarineReturnZero() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine(TEST_ZERO_MESSAGES_COMMANDS);

        //when
        submarine.run();

        //then
        Assertions.assertEquals(0, submarine.getDirection());
    }
}