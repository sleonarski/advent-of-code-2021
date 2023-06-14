package org.example;

import static java.util.Collections.emptyList;
import static org.example.DayTwoPartOne.solvePartOne;
import static org.example.MockData.EMPTY;
import static org.example.MockData.INVALID_VALUE_LIST;
import static org.example.MockData.ONE_VALUE_LIST;
import static org.example.MockData.SAME_VALUE_LIST;
import static org.example.MockData.TEST_DATA;
import static org.example.MockData.TEST_PATH;
import static org.example.utils.DataParser.convertToInteger;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

class DayTwoPartOneTest {

    @Test
    void shouldRunPartOne() {
        //when
        int solution = solvePartOne(TEST_DATA);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneWithPathInput() {
        //when
        int solution = solvePartOne(TEST_PATH);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = solvePartOne(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = solvePartOne(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = solvePartOne(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnInvalidValueList() {
        //expected
        assertThrowsExactly(IllegalArgumentException.class, () -> solvePartOne(INVALID_VALUE_LIST));
    }
}