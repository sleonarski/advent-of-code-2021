package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.example.DayTwoPartOne.solvePartOne;
import static org.example.DayTwoPartTwo.solvePartTwo;
import static org.example.MockData.*;
import static org.example.MockData.INVALID_VALUE_LIST;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class DayTwoPartTwoTest {

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = solvePartTwo(TEST_DATA);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartTwoWithPathInput() {
        //when
        int solution = solvePartTwo(TEST_PATH);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = solvePartTwo(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = solvePartTwo(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = solvePartTwo(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> solvePartTwo(INVALID_VALUE_LIST));
    }
}