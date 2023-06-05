package org.example;

import static org.example.PartTwo.runPartTwo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PartTwoTest {

    private static final Integer WINDOW_SIZE = 3;
    private static final String PATH = "src/test/resources/input.txt";
    private static final String EMPTY_LIST = "src/test/resources/empty.txt";
    private static final String ONE_ELEMENT_LIST = "src/test/resources/one-element.txt";
    private static final String SAME_ELEMENT_LIST = "src/test/resources/same-element.txt";

    @Test
    void shouldRunPartTwo() {
        //when
        int solution = runPartTwo(PATH, WINDOW_SIZE);
        assertEquals(5,solution);
    }

    @Test
    void shouldProcessEmptyList() {
        //when
        int solution = runPartTwo(EMPTY_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessOneElementList() {
        //when
        int solution = runPartTwo(ONE_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessSameElementList() {
        //when
        int solution = runPartTwo(SAME_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }
}