package org.example;

import static java.util.Collections.emptyList;
import static org.example.DataReader.convertToInteger;
import static org.example.DataReader.readFileAsList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Objects;
import org.junit.jupiter.api.Test;

class DataReaderTest {

    private static final String PATH = "src/test/resources/input.txt";
    private static final List<String> EMPTY_LIST = emptyList();
    private static final List<String> ONE_ELEMENT = List.of("240");
    private static final List<String> SAME_ELEMENT = List.of("240", "240", "240", "240", "240", "240", "240", "240", "240", "240", "240", "240");
    private static final List<String> NOT_NUMBER = List.of("aas", "tre", "ldsf", "asf", "bbb", "mbnd", "wer");

    List<String> testList = List.of("2","3","4","5","6");

    @Test
    void shouldReadFileAsList() {
        //when
        List<String> dataList = readFileAsList(PATH);

        //then
        assertEquals(10, dataList.size());
        assertInstanceOf(String.class, dataList.get(0));
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
        assertEquals(12,integersList.size());
        assertInstanceOf(Integer.class, integersList.get(0));
    }

    @Test
    void shouldEmptyList() {
        //when
        List<Integer> integersList = convertToInteger(NOT_NUMBER);

        //then
        assertEquals(0,integersList.size());
    }
}