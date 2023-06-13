package org.example;

import static org.example.PartOne.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartOneTest {

    private static final String TEST_DATA = "src/test/resources/test-data.txt";
    private static final String EMPTY = "src/test/resources/empty-list.txt";
    private static final String ONE_VALUE_LIST = "src/test/resources/one-value.txt";
    private static final String SAME_VALUE_LIST = "src/test/resources/same-value.txt";
    private static final String INVALID_VALUE_LIST = "src/test/resources/invalid-input.txt";

    @Test
    void shouldRunPartOne() {
        //when
        int solution = solvePartOne(TEST_DATA);

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
        //when
        int solution = solvePartOne(INVALID_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }
}