package org.example.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.example.utils.DataReader.readFileAsList;

import java.util.List;
import org.junit.jupiter.api.Test;

class DataReaderTest {

    private static final String PATH = "common/src/main/test/resources/input.txt";
    private static final String EMPTY_LIST_PATH = "common/src/main/test/resources/empty.txt";

    @Test
    void shouldReadFileAsList() {
        //when
        List<String> dataList = readFileAsList(PATH);

        //then
        assertEquals(10, dataList.size());
        assertInstanceOf(String.class, dataList.get(0));
    }

    @Test
    void shouldReadEmptyList() {
        //when
        List<String> stringList = readFileAsList(EMPTY_LIST_PATH);

        //then
        assertEquals(0, stringList.size());
    }
}