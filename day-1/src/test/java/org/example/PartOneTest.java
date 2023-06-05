package org.example;

import static org.example.PartOne.runPartOne;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartOneTest {

    private static final Integer WINDOW_SIZE = 1;
    private static final String PATH = "src/test/resources/input.txt";
    private static final String EMPTY_LIST = "src/test/resources/empty.txt";
    private static final String ONE_ELEMENT_LIST = "src/test/resources/one-element.txt";
    private static final String SAME_ELEMENT_LIST = "src/test/resources/same-element.txt";

    @Test
    void shouldRunPartOne() {
        //when
        int solution = runPartOne(PATH, WINDOW_SIZE);
        assertEquals(7,solution);
    }

    @Test
    void shouldProcessEmptyList() {
        //when
        int solution = runPartOne(EMPTY_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessOneElementList() {
        //when
        int solution = runPartOne(ONE_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }

    @Test
    void shouldProcessSameElementList() {
        //when
        int solution = runPartOne(SAME_ELEMENT_LIST, WINDOW_SIZE);
        assertEquals(0,solution);
    }
}