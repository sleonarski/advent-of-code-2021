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
        submarine.run(TEST_COMMANDS);

        //then
        Assertions.assertEquals(150, submarine.getDirection());
    }

    @Test
    void shouldAdvancedSubmarineCalculateCorrectly() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine();

        //when
        submarine.run(TEST_COMMANDS);

        //then
        Assertions.assertEquals(900, submarine.getDirection());
    }

    @Test
    void shouldSimpleSubmarineReturnZero() {
        //given
        SimpleSubmarine submarine = new SimpleSubmarine();

        //when
        submarine.run(TEST_ZERO_MESSAGES_COMMANDS);

        //then
        Assertions.assertEquals(0, submarine.getDirection());
    }

    @Test
    void shouldAdvancedSubmarineReturnZero() {
        //given
        AdvancedSubmarine submarine = new AdvancedSubmarine();

        //when
        submarine.run(TEST_ZERO_MESSAGES_COMMANDS);

        //then
        Assertions.assertEquals(0, submarine.getDirection());
    }
}