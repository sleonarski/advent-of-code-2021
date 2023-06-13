package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoTest {

    private static final String TEST_DATA = "src/test/resources/test-data.txt";
    private static final String EMPTY = "src/test/resources/empty-list.txt";
    private static final String ONE_VALUE_LIST = "src/test/resources/one-value.txt";
    private static final String SAME_VALUE_LIST = "src/test/resources/same-value.txt";

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = PartTwo.solvePartTwo(TEST_DATA);

        //then
        assertEquals(900, solution);
    }

    @Test
    void shouldRunPartOneOnEmptyList() {
        //when
        int solution = PartTwo.solvePartTwo(EMPTY);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnOneValueList() {
        //when
        int solution = PartTwo.solvePartTwo(ONE_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }

    @Test
    void shouldRunPartOneOnSameValueList() {
        //when
        int solution = PartTwo.solvePartTwo(SAME_VALUE_LIST);

        //then
        assertEquals(0, solution);
    }
}