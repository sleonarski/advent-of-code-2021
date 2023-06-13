package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Collections.emptyList;
import static org.example.DayTwoPartOne.solvePartOne;
import static org.example.DayTwoPartTwo.solvePartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

class DayTwoPartTwoTest {

    private static final List<String> TEST_DATA = List.of("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2");
    private static final List<String> EMPTY = emptyList();
    private static final List<String> ONE_VALUE_LIST = List.of("forward 5");
    private static final List<String> SAME_VALUE_LIST = List.of("forward 5", "forward 5", "forward 5", "forward 5", "forward 5", "forward 5");
    private static final List<String> INVALID_VALUE_LIST = List.of("forward ex", "random value", "245 52 8", "e", " ", "TestV4lU3");

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = solvePartTwo(TEST_DATA);

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
        assertThrowsExactly(RuntimeException.class, () -> solvePartTwo(INVALID_VALUE_LIST));
    }
}