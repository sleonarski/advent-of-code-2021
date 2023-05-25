package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartTwoTest {

    private static final String TEST_DATA = "src/test/resources/test-data.txt";
    private static final String EMPTY = "C:/Users/alan/IdeaProjects/advent-of-code/advent-of-code-2021/day-2/src/test/resources/empty-list.txt";
    private static final String ONE_VALUE_LIST = "C:\\Users\\alan\\IdeaProjects\\advent-of-code\\advent-of-code-2021\\day-2\\src\\test\\resources\\one-value.txt";
    private static final String SAME_VALUE_LIST = "C:\\Users\\alan\\IdeaProjects\\advent-of-code\\advent-of-code-2021\\day-2\\src\\test\\resources\\same-value.txt";

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