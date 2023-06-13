package org.example.utils;

import static java.util.Collections.emptyList;
import static org.example.utils.DataParser.convertToInteger;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class DataParserTest {

    private static final List<String> INPUT_LIST = List.of("199", "200", "208", "210", "200", "207", "240", "269", "260", "263");
    private static final List<String> EMPTY_LIST = emptyList();
    private static final List<String> ONE_ELEMENT = List.of("240");
    private static final List<String> SAME_ELEMENT = List.of("240", "240", "240", "240", "240", "240", "240", "240", "240", "240", "240", "240");
    private static final List<String> NOT_NUMBER = List.of("aas", "tre", "ldsf", "asf", "bbb", "mbnd", "wer");

    @Test
    void shouldReturnListOfIntegers() {
        //when
        List<Integer> integerList = convertToInteger(INPUT_LIST);

        //then
        assertEquals(10, integerList.size());
    }

    @Test
    void shouldReturnEmptyList() {
        //when
        List<Integer> dataList = convertToInteger(EMPTY_LIST);

        //then
        assertEquals(0, dataList.size());
    }

    @Test
    void shouldReturnListWithOneElement() {
        //when
        List<Integer> dataList = convertToInteger(ONE_ELEMENT);

        //then
        assertEquals(1, dataList.size());
        assertInstanceOf(Integer.class, dataList.get(0));
    }

    @Test
    void shouldReturnListWithSameElement() {
        //when
        List<Integer> integersList = convertToInteger(SAME_ELEMENT);

        //then
        assertEquals(12, integersList.size());
        assertInstanceOf(Integer.class, integersList.get(0));
    }

    @Test
    void shouldThrowNumberFormatException() {
        //expected
        assertThrowsExactly(NumberFormatException.class, () -> convertToInteger(NOT_NUMBER));
    }
}