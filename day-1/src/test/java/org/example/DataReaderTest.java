package org.example;

import static org.example.DataReader.convertToInteger;
import static org.example.DataReader.readFileAsList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class DataReaderTest {

    private static final String PATH = "src/test/resources/input.txt";
    private static final String EMPTY_LIST = "src/test/resources/empty.txt";
    private static final String ONE_ELEMENT = "src/test/resources/one-element.txt";
    private static final String SAME_ELEMENT = "src/test/resources/same-element.txt";
    private static final String NOT_NUMBER = "src/test/resources/not-number-list.txt";

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
        List<String> dataList = readFileAsList(EMPTY_LIST);

        //then
        assertEquals(0, dataList.size());
    }

    @Test
    void shouldReturnListWithOneElement() {
        //when
        List<String> dataList = readFileAsList(ONE_ELEMENT);

        //then
        assertEquals(1, dataList.size());
        assertInstanceOf(String.class, dataList.get(0));
    }

    @Test
    void shouldReturnListWithSameElement() {
        //when
        List<Integer> integersList = convertToInteger(testList);

        //then
        assertEquals(12,integersList.size());
        assertInstanceOf(Integer.class, integersList.get(0));
    }

    @Test
    void shouldGetDataAsIntegersList() {
        //when
        List<Integer> integersList = convertToInteger(testList);

        //then
        assertEquals(0,integersList.size());
    }
}