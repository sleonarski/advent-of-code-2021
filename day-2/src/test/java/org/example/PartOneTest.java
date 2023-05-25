package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartOneTest {

    private static final String TEST_DATA = "src/test/resources/test-data.txt";
    private static final String EMPTY = "src/test/resources/empty-list.txt";
    private static final String ONE_VALUE_LIST = "src/test/resources/one-value.txt";
    private static final String SAME_VALUE_LIST = "src/test/resources/same-value.txt";

    @Test
    void shouldRunPartOne() {
        //when
        int solution = PartOne.solvePartOne(TEST_DATA);

        //then
        assertEquals(150, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = PartOne.solvePartOne(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = PartOne.solvePartOne(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = PartOne.solvePartOne(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }
}